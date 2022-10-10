package collections;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;


class MyLinkedListTest {

    List<String> list;

    @BeforeEach
    public void newList() {
        list = new MyLinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
    }

    @Test
    void shouldThrowNullPointerExceptionWhenObjectIsNull() {


    }
    @Test
    void shouldReturnSizeOfMyLinkedList() {
        // When
        int size = list.size();
        // Then
        Assertions.assertEquals(5, size);
    }

    @Test
    void shouldReturnFalseWhenLinkedListIsNotEmpty() {
        // When
        boolean isEmpty = list.isEmpty();
        // Then
        Assertions.assertFalse(isEmpty);
    }

    @Test
    void shouldCheckIfLinkedListContainsElement() {
        // When
        boolean contains = list.contains("two");
        // Then
        Assertions.assertTrue(contains);
    }

    @Test
    void shouldReturnEmptyLinkedList() {
        // When
        list.clear();
        int size = list.size();
        // Then
        Assertions.assertEquals(0, size);
    }

    @Test
    void shouldReturnElementWithGivenIndex() {
        // When
        String element = list.get(1);
        // Then
        Assertions.assertEquals("two", element);
    }
    @Test
    void shouldThrowExceptionWhenIndexIsBiggerThanSize() {
        // When
        // Then
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.get(10));
    }

    @Test
    void shouldRemoveElementFromLinkedList() {
        // When
        list.remove("three");
        String element = list.get(2);
        // Then
        Assertions.assertEquals("four", element);
    }
    @Test
    void shouldThrowExceptionWhenIndexOfRemovingObjectIsLowerThanZero() {
        // When
        // Then
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1));
    }

    @Test
    void shouldRemoveAndReturnElementWithGivenIndex() {
        // When
        String element = list.remove(1);
        // Then
        Assertions.assertEquals("two", element);
    }

    @Test
    void shouldRemoveElementWithGivenIndex() {
        // When
        list.remove(1);
        String element = list.get(1);
        // Then
        Assertions.assertEquals("three", element);
    }

    @Test
    void shouldReturnFalseWhenThereIsNoElementInList() {
        // When
        boolean ifExist = list.remove("six");
        // Then
        Assertions.assertFalse(ifExist);
    }

    @Test
    void shouldReturnTrueAfterRemovingElementFromList() {
        // When
        boolean ifExist = list.remove("two");
        // Then
        Assertions.assertTrue(ifExist);
    }


    @Test
    void shouldReturnFirstIndexOfObjectFromList() {
        // When
        int index = list.indexOf("four");
        // Then
        Assertions.assertEquals(3, index);
    }

    @AfterEach
    void after() {
        list.clear();
    }
}