/*
 * Copyright (c) 2017. sh-game all Rights Resolved
 */

package info.xiaomo.bean;

public class NutritionFacts {
    // not optional
    private final int servingSize;
    private final int servings;
    // optional
    private final int calories;
    private final int fat;
    private final int carbohydrate;
    private final int sodium;

    public NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        // optional
        calories = builder.calories;
        fat = builder.fat;
        carbohydrate = builder.carbohydrate;
        sodium = builder.sodium;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public int getSodium() {
        return sodium;
    }


    public static class Builder implements IBuild<NutritionFacts> {
        private final int servingSize;
        private final int servings;
        // optional
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }


        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        @Override
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }


    }

    public interface IBuild<T> {
        T build();
    }


    public static void main(String[] args) {
        NutritionFacts facts = new Builder(5200, 32).calories(100).carbohydrate(190).fat(1).build();
        System.out.println(facts.getCalories());
    }

}


