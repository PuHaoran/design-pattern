package com.walle.guide.buillder;

/**
 * @author 123
 * @create 2022/9/18 17:45
 */
public class Garden {
    String name;
    Integer width;
    Integer height;
    String loc;

    @Override
    public String toString() {
        return "Garden{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", loc='" + loc + '\'' +
                '}';
    }

    private Garden() {
    }

    public static class GardenBuilder {
        Garden garden = new Garden();

        public GardenBuilder basicInfo (String name, Integer width, Integer height) {
            garden.name = name;
            garden.width = width;
            garden.height = height;
            return this;
        }

        public GardenBuilder loc(String location) {
            garden.loc = location;
            return this;
        }

        public Garden build() {
            return this.garden;
        }
    }
}
