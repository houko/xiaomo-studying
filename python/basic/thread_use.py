from threading import Thread


class MyThread(Thread):

    # 构造函数
    def __init__(self):
        Thread.__init__(self)
        self.count = 0

    # 测试方法
    @staticmethod
    def console():
        print('11111111111')

    # run方法
    def run(self):
        self.console()


# 使用线程
t = MyThread()
t.start()
