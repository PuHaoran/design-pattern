package com.walle.guide.iterator;

/**
 * @author 123
 * @create 2022/9/21 22:13
 */
public class PetRepository implements Container{

    public String[] pets = {"cat", "dog"};

    @Override
    public Iterator getIterator() {
        return new PetIterator();
    }

    private class PetIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < pets.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return pets[index++];
            }
            return null;
        }
    }
}
