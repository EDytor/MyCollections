package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Deque;
import java.util.NoSuchElementException;

class MyLinkedListDequeTest {

    Deque<String> list = new MyLinkedList<>();

    @BeforeEach
    void init() {
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
    }
    @Test
    void shouldAddElementToTheLinkedList() {
        // When
        int size = list.size();
        // Then
        Assertions.assertEquals(4, size);
    }
    @Test
    void shouldAddObjectAsTheFirstElementInTheList() {
        // When
        list.addFirst("new");
        String element = list.getFirst();
        // Then
        Assertions.assertEquals("new", element);
    }

    @Test
    void shouldAddObjectAsTheLastElementInTheList() {
        // When
        list.addLast("new");
        String element = list.getLast();
        // Then
        Assertions.assertEquals("new", element);
    }

    @Test
    void shouldReturnTrueAfterRemovingObjectFromList() {
        // When
        list.add("three");
        boolean correctlyRemoved = list.removeFirstOccurrence("three");
        // Then
        Assertions.assertTrue(correctlyRemoved);
    }

    @Test
    void shouldReturnTrueAfterRemovingLastOccurrenceOfObjectInTheList() {
        // When
        list.add("two");
        boolean correctlyRemoved = list.removeLastOccurrence("two");
        // Then
        Assertions.assertTrue(correctlyRemoved);
    }

    @Test
    void shouldInsertsElementAtTheFrontOfMyLinkedList() {
        // When
        list.offerFirst("new");
        String element = list.getFirst();
        // Then
        Assertions.assertEquals("new", element);
    }

    @Test
    void shouldReturnFalseWhenElementIsNull() {
        // When
        // Then
        Assertions.assertThrows(NullPointerException.class, () -> {
            list.offerFirst(null);
        });
    }

    @Test
    void shouldInsertsElementAtTheEndOfMyLinkedList() {
        // When
        list.offerLast("new");
        String element = list.getLast();
        // Then
        Assertions.assertEquals("new", element);
    }

    @Test
    void shouldReturnFalseWhenAddedElementIsNull() {
        // When
        boolean offerNull = list.offerLast(null);
        // Then
        Assertions.assertFalse(offerNull);
    }

    @Test
    void shouldReturnFirstElementFromMyLinkedList() {
        // When
        String element = list.removeFirst();
        // Then
        Assertions.assertEquals("one", element);
    }

    @Test
    void shouldRemoveFirstElementFromMyLinkedList() {
        // When
        list.removeFirst();
        String element = list.getFirst();
        // Then
        Assertions.assertEquals("two", element);
    }

    @Test
    void shouldReturnLastElementFromMyLinkedList() {
        // When
        String element = list.removeLast();
        // Then
        Assertions.assertEquals("four", element);
    }

    @Test
    void shouldRemoveLastElementFromMyLinkedList() {
        // When
        list.removeLast();
        String element = list.getLast();
        // Then
        Assertions.assertEquals("three", element);
    }

    @Test
    void shouldRemoveAndReturnFirstElementFromMyLinkedListIfIsNotNull() {
        // When
        String element = list.pollFirst();
        // Then
        Assertions.assertEquals("one", element);
    }

    @Test
    void shouldReturnNullIfMyLinkedListIsEmpty() {
        // When
        list.clear();
        // Then
        Assertions.assertNull(list.pollFirst());
    }

    @Test
    void shouldReturnNewSizeOfLinkedListAfterPollFirst() {
        // When
        list.pollFirst();
        int size = list.size();
        // Then
        Assertions.assertEquals(3, size);
    }

    @Test
    void shouldRemoveAndReturnLastElementFromMyLinkedListIfIsNotEmpty() {
        // When
        String element = list.pollLast();
        // Then
        Assertions.assertEquals("four", element);
    }

    @Test
    void shouldReturnNewSizeOfLinkedListAfterPollLast() {
        // When
        list.pollLast();
        int size = list.size();
        // Then
        Assertions.assertEquals(3, size);
    }

    @Test
    void shouldReturnNullWhenLinkedListIsEmpty() {
        // When
        list.clear();
        // Then
        Assertions.assertNull(list.pollLast());
    }

    @Test
    void shouldReturnAndRemoveTheHeadOfList() {
        // When
        String element = list.poll();
        // Then
        Assertions.assertEquals("one", element);
    }

    @Test
    void shouldReturnNullWhenListIsEmpty() {
        // When
        list.clear();
        list.add("one");
        list.pollFirst();
        String element = list.peek();
        // Then
        Assertions.assertNull(element);
    }

    @Test
    void shouldInsertsElementAtTheFrontOfList() {
        // When
        list.push("new");
        String element = list.getFirst();
        // Then
        Assertions.assertEquals("new", element);
    }

    @Test
    void shouldThrowExceptionWhenLinkedListIsEmpty() {
        // When
        list.clear();
        // Then
        Assertions.assertThrows(NoSuchElementException.class, list::getLast);
    }

    @Test
    void shouldReturnAndRemoveFirstElementFromList() {
        // When
        String element = list.pop();
        // Then
        Assertions.assertEquals("one", element);
    }

    @Test
    void shouldReturnNullIfThereIsNoElementInTheList() {
        // When
        list.clear();
        // Then
        Assertions.assertNull(list.pop());
    }
}