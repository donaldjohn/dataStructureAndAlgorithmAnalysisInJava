package ch1;

import org.omg.CORBA.Any;
import org.omg.CORBA.PRIVATE_MEMBER;

public class GenericMemoryCell<AnyType>
{
    public AnyType read()
    {
        return storedValue;
    }

    public void write(AnyType value)
    {
        this.storedValue = value;
    }

    private AnyType storedValue;
}
