package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

class MyListTest {
    List<String> list;

    @BeforeEach
    void init() {
        list = new MyList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add(null);
        list.add("four");
    }

    @Test
    void shouldReturnSizeMyList() {
        // When
        // Then
        Assertions.assertEquals(5, list.size());
    }

    @Test
    void shouldCreateObjectWhenCapacityIsBiggerOrEqualToZero() {
        // When
        //Then
        Assertions.assertDoesNotThrow(() -> new MyList<>(10));
    }

    @Test
    void shouldAddValueToMyList() {
        // When
        list.add("five");
        list.add("six");
        list.add("seven");
        // Then
        Assertions.assertEquals("six", list.get(6));
    }

    @Test
    void shouldThrowExceptionWhenCapacityIsLessThanZero() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> new MyList<String>(-1));
    }

    @Test
    void shouldReturnFalseWhenMyListIsNotEmpty() {
        // When
        // Then
        Assertions.assertFalse(list.isEmpty());
    }
    @Test
    void shouldReturnTrueWhenMyListIsEmpty() {
        // When
        list.clear();
        // Then
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    void shouldRemoveObjectFromList() {
        // When
        // Then
        Assertions.assertTrue(list.remove("four"));
    }

    @Test
    void shouldReturnFalseWhenThereIsNoSuchObjectInTheList() {
        // When
        // Then
        Assertions.assertFalse(list.remove("zero"));
    }

    @Test
    void shouldClearWholeList() {
        // When
        list.clear();
        // Then
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    void shouldRemoveObjectWithGivenIndex() {
        // When
        list.remove(2);
        // Then
        Assertions.assertFalse(list.contains("three"));
    }

    @Test
    void shouldThrowExceptionWhenIndexOfRemoveIsBiggerThanSizeOfList() {
        // When
        // Then
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.remove(10));
    }

    @Test
    void shouldReturnSmallerSizeOfListAfterRemoving() {
        // When
        list.remove(2);
        // Then
        Assertions.assertEquals(4, list.size());
    }


    @Test
    void shouldReturnTrueIfListContainsObject() {
        // When
        // Then
        Assertions.assertTrue(list.contains("one"));
    }

    @Test
    void shouldReturnFalseIfListNotContainsObject() {
        // When
        // Then
        Assertions.assertFalse(list.contains("ten"));
    }

    @Test
    void shouldReturnTheRemovedElement() {
        // When
        // Then
        Assertions.assertEquals("three", list.remove(2));
    }
    @Test
    void shouldThrowExceptionWhenIndexIsBiggerThanSize() {
        // When
        list.clear();
        // Then
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.remove(10));
    }
}