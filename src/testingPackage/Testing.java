package testingPackage;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Testing {

    // Unit testing for the size
    @Test
    public void getSizeOfList() {
        // Inicializacion
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Lo que queremos probar
        assertEquals(4, list.size());
    }

    @Test
    public void getSizeOfEmptyList() {
        List<Integer> list = new ArrayList<>();

        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void getSizeOfListNull() {
        List<Integer> list = null;

        list.size();
    }


    // Unit testing for clearing the list
    @Test
    public void getSizeOfListAfterClear() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.clear();

        assertEquals(0, list.size());
    }

    @Test
    public void getSizeOfClearList() {
        List<Integer> list = new ArrayList<>();
        list.clear();

        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void clearListOfNull() {
        List<Integer> list = null;

        list.clear();
    }


    // Unit test to add items
    @Test
    public void getSizeAfterAddingItem() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(5, list.size());
    }

    @Test
    public void addItemsAfterRemoving() {
        List<Integer> list = new ArrayList<>();
        list.add(2);

        list.clear();

        list.add(2);

        assertEquals(2, list.get(0).intValue());

    }

    @Test
    public void getElementCero() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        assertEquals(1, list.get(0).intValue());
    }


    // Unit test to check if an item exists
    @Test
    public void containsTheElement() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertTrue(list.contains(1));
    }

    @Test(expected = NullPointerException.class)
    public void getNullElement() {
        List<Integer> list = null;

        list.contains(0);
    }

    @Test
    public void notContainsElement() {
        List<Integer> list = new ArrayList<>();
        list.add(6);

        assertFalse(list.contains(1));
    }


    // Unit test to get elements by index
    @Test
    public void getElementByIndex() {
        List<Integer> list = new ArrayList<>();
        list.add(8);

        assertEquals(8, list.get(0).intValue());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementOutOfBounds() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.get(4);
    }

    @Test
    public void getElementAfterRemoving() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(0);

        assertEquals(2, list.get(0).intValue());
    }


    // Unit testing for searching the index of an object
    @Test
    public void searchIndex() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(0, list.indexOf(1));
    }

    @Test(expected = NullPointerException.class)
    public void searchIndexOfNull() {
        List<Integer> list = null;

        list.indexOf(1);
    }

    @Test
    public void searchIndexAfterSort() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(4);
        list.add(1);
        list.add(2);

        Collections.sort(list);

        assertEquals(0, list.indexOf(0));
    }


    // Unit test for removing elements
    @Test
    public void removeElement() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(0);

        assertEquals(2, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeNotExistentElement() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(4);
    }

    @Test(expected = NullPointerException.class)
    public void removeFromNull() {
        List<Integer> list = null;

        list.remove(0);
    }

}
