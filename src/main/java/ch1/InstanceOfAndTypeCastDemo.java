package ch1;

public class InstanceOfAndTypeCastDemo<T>
{
    private void test()
    {
       // T obj = new T();
       // T[] tArr = new T[10];

        //
        Object[] objArray = new Object[5];
        T[] tArray = (T[]) objArray;
    }



    public static void main(String[] args)
    {
        GenericMemoryCell<Integer> cell1 = new GenericMemoryCell<Integer>();
        cell1.write(4);

        Object cell = cell1;

        GenericMemoryCell<String> cell2 = (GenericMemoryCell<String>)cell;//类型转化 在runtime时成功

        String S = cell2.read(); //此处报错ava.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String


        //=====================================
        GenericMemoryCell<String>[] arr1 = new GenericMemoryCell<String>[10];
        GenericMemoryCell<Double> celD = new GenericMemoryCell<>();
        celD.write(4.5);
        Object[] arr2 = arr1;
        arr1[0] = celD;
        String s = arr1[0].read();

    }
}
