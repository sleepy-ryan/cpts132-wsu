package cpts132.data_structures;

public class Test {

    public static void main(String[] args) {

        MySimpleSet<Integer> intSet = new MySimpleSet<Integer>();

        intSet.add(5);

        intSet.add(4);

        intSet.add(7);

        intSet.add(2);

        intSet.add(6);

        intSet.add(9);

        intSet.add(8);

        intSet.add(3);


        System.out.println(intSet);

        System.out.println("Adding 3...");

        if (intSet.add(3)) {

            System.out.println("Successful!");

        } else {

            System.out.println("Error, cannot add duplicates");

        }

        System.out.println("Adding 24...");

        if (intSet.add(24)) {

            System.out.println("Successful!");

        } else {

            System.out.println("Failed, cannot add duplicate values!");

        }

        System.out.println(intSet);


    }

}