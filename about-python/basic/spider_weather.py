# 抓取內容實時顯示，有幾條顯示幾條
# coding:utf-8
from collections import Iterable, Iterator

import requests


class WeatherIterator(Iterator):

    def __init__(self, cities):
        self.cities = cities
        self.index = 0

    @staticmethod
    def get_weather(city):
        r = requests.get("http://wthrcdn.etouch.cn/weather_mini?city=" + city)
        data = r.json()['data']['forecast'][0]
        return '%s %s ,%s' % (city, data['low'], data['high'])

    def __next__(self):
        if self.index == len(self.cities):
            raise StopIteration
        city = self.cities[self.index]
        self.index += 1

        return self.get_weather(city)


class WeatherIterable(Iterable):

    def __init__(self, cities):
        self.cities = cities

    def __iter__(self):
        return WeatherIterator(self.cities)


for x in WeatherIterable(['杭州', '北京', '上海', '长春', '南京', '十堰', '武汉', '郑州', '合肥', '哈尔滨', '伊春', '鸡西']):
    print(x)
