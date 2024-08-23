package oopsLevel3;

class VolumeCalculator {
    double volume(double length, double breadth, double height) {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        VolumeCalculator calc = new VolumeCalculator();
        double vol = calc.volume(5, 4, 3);
        System.out.println("Volume of Cuboid: " + vol);
    }
}

