package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Deque;
import java.util.NoSuchElementException;

class MyLinkedListDequeTest {

    Deque<String> deque;

    @BeforeEach
    void init() {
        deque = new MyLinkedList<>();
        deque.add("one");
        deque.add("two");
        deque.add("three");
        deque.add("four");
    }

    @Test
    void shouldAddElementToTheLinkedList() {
        // When
        int size = deque.size();
        // Then
        Assertions.assertEquals(4, size);
    }
    @Test
    void shouldThrowExceptionWhenFirstObjectIsNull() {
        //When
        deque.clear();
        //Then
        Assertions.assertThrows(NoSuchElementException.class, ()-> deque.getFirst());
    }
    @Test
    void shouldAddObjectAsTheFirstElementInTheList() {
        // When
        deque.addFirst("new");
        String element = deque.getFirst();
        // Then
        Assertions.assertEquals("new", element);
    }

    @Test
    void shouldAddObjectAsTheLastElementInTheList() {
        // When
        deque.addLast("new");
        String element = deque.getLast();
        // Then
        Assertions.assertEquals("new", element);
    }

    @Test
    void shouldAddObjectAsTheLastAndAsFirstWhenSizeIsZero() {
        // When
        deque.clear();
        deque.addLast("new");
        // Then
        Assertions.assertEquals("new", deque.getFirst());
    }

    @Test
    void shouldReturnSizeEqualsZeroAfterRemovingFirstAndAlsoLastElement() {
        // When
        Deque<Integer> deque = new MyLinkedList<>();
        deque.add(1);
        // Then
        Assertions.assertEquals(1, deque.removeLast());
    }

    @Test
    void shouldThrowExceptionWhenObjectIsNull() {
        // When
        // Then
        Assertions.assertThrows(NullPointerException.class, () -> deque.addLast(null));
    }

    @Test
    void shouldReturnTrueAfterRemovingObjectFromList() {
        // When
        deque.add("three");
        boolean correctlyRemoved = deque.removeFirstOccurrence("three");
        // Then
        Assertions.assertTrue(correctlyRemoved);
    }

    @Test
    void shouldReturnTrueAfterRemovingLastOccurrenceOfObjectInTheList() {
        // When
        deque.add("one");
        boolean correctlyRemoved = deque.removeLastOccurrence("one");
        // Then
        Assertions.assertTrue(correctlyRemoved);
    }
    @Test
    void shouldReturnFalseIfThereIsNoSuchElementToRemove() {
        // When
        boolean correctlyRemoved = deque.removeLastOccurrence("fifteen");
        // Then
        Assertions.assertFalse(correctlyRemoved);
    }

    @Test
    void shouldInsertsElementAtTheFrontOfMyLinkedList() {
        // When
        deque.offerFirst("new");
        String element = deque.getFirst();
        // Then
        Assertions.assertEquals("new", element);
    }

    @Test
    void shouldReturnFalseWhenElementIsNull() {
        // When
        // Then
        Assertions.assertThrows(NullPointerException.class, () -> deque.offerFirst(null));
    }

    @Test
    void shouldInsertsElementAtTheEndOfMyLinkedList() {
        // When
        deque.offerLast("new");
        String element = deque.getLast();
        // Then
        Assertions.assertEquals("new", element);
    }

    @Test
    void shouldReturnFirstElementFromMyLinkedList() {
        // When
        String element = deque.removeFirst();
        // Then
        Assertions.assertEquals("one", element);
    }

    @Test
    void shouldRemoveFirstElementFromMyLinkedList() {
        // When
        deque.removeFirst();
        String element = deque.getFirst();
        // Then
        Assertions.assertEquals("two", element);
    }

    @Test
    void shouldReturnLastElementFromMyLinkedList() {
        // When
        String element = deque.removeLast();
        // Then
        Assertions.assertEquals("four", element);
    }

    @Test
    void shouldRemoveLastElementFromMyLinkedList() {
        // When
        deque.removeLast();
        String element = deque.getLast();
        // Then
        Assertions.assertEquals("three", element);
    }

    @Test
    void shouldRemoveAndReturnFirstElementFromMyLinkedListIfIsNotNull() {
        // When
        String element = deque.pollFirst();
        // Then
        Assertions.assertEquals("one", element);
    }

    @Test
    void shouldReturnNullIfMyLinkedListIsEmpty() {
        // When
        deque.clear();
        // Then
        Assertions.assertNull(deque.pollFirst());
    }

    @Test
    void shouldReturnNewSizeOfLinkedListAfterPollFirst() {
        // When
        deque.pollFirst();
        int size = deque.size();
        // Then
        Assertions.assertEquals(3, size);
    }

    @Test
    void shouldRemoveAndReturnLastElementFromMyLinkedListIfIsNotEmpty() {
        // When
        String element = deque.pollLast();
        // Then
        Assertions.assertEquals("four", element);
    }

    @Test
    void shouldReturnNewSizeOfLinkedListAfterPollLast() {
        // When
        deque.pollLast();
        int size = deque.size();
        // Then
        Assertions.assertEquals(3, size);
    }

    @Test
    void shouldReturnNullWhenPolledObjectIsNull() {
        // When
        deque.add(null);
        // Then
        Assertions.assertNull(deque.pollLast());

    }

    @Test
    void shouldReturnNullWhenLinkedListIsEmpty() {
        // When
        deque.clear();
        // Then
        Assertions.assertNull(deque.pollLast());
    }

    @Test
    void shouldReturnAndRemoveTheHeadOfList() {
        // When
        String element = deque.poll();
        // Then
        Assertions.assertEquals("one", element);
    }

    @Test
    void shouldReturnNullWhenListIsEmpty() {
        // When
        deque.clear();
        deque.add("one");
        deque.pollFirst();
        String element = deque.peek();
        // Then
        Assertions.assertNull(element);
    }
    @Test
    void shouldReturnFirstElement() {
        // When
        String element = deque.peek();
        // Then
        Assertions.assertEquals("one", element);
    }

    @Test
    void shouldInsertsElementAtTheFrontOfList() {
        // When
        deque.push("new");
        String element = deque.getFirst();
        // Then
        Assertions.assertEquals("new", element);
    }

    @Test
    void shouldThrowExceptionWhenLinkedListIsEmpty() {
        // When
        deque.clear();
        // Then
        Assertions.assertThrows(NoSuchElementException.class, deque::getLast);
    }

    @Test
    void shouldReturnAndRemoveFirstElementFromList() {
        // When
        String element = deque.pop();
        // Then
        Assertions.assertEquals("one", element);
    }

    @Test
    void shouldReturnNullIfThereIsNoElementInTheList() {
        // When
        deque.clear();
        // Then
        Assertions.assertNull(deque.pop());
    }
    @Test
    void shouldReturnNullIfLastElementIsNull() {
        // When
        deque.clear();
        // Then
        Assertions.assertNull(deque.pollLast());
    }
}