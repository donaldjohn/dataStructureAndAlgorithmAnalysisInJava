package ch1;

import sun.rmi.server.InactiveGroupException;

public class TypeBoundDemo
{
    public static <AnyType extends Comparable<? super AnyType>> AnyType findMax(AnyType[] arr)
    {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].compareTo(arr[maxIndex]) > 0)
            {
                maxIndex = i;
            }
        }

        return arr[maxIndex];
    }

    static class Shape implements Comparable<Shape>
    {
        private int size;



        public Shape(int size)
        {
            this.size = size;
        }

        public int compareTo(Shape o)
        {
            return this.size - o.size;
        }

        @Override
        public String toString()
        {
            return size + "";
        }
    }

    static class Square extends Shape
    {
        public Square(int size)
        {
            super(size);
        }
    }

    public static void main(String[] args)
    {
        Shape[] shapesArray = {new Shape(1), new Shape(2), new Shape(3), new Square(4)};

        Square[] squaresArray = {new Square(1), new Square(2), new Square(3), new Square(4)};

        System.out.println(findMax(shapesArray));

        System.out.println(findMax(squaresArray));
    }

}
