package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;

class MyLinkedListTest {

    @Test
    void shouldReturnSizeOfMyLinkedList() {
        // Given
        List<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        // Then
        Assertions.assertEquals(5, list.size());
    }

    @Test
    void shouldReturnFalseWhenLinkedListIsNotEmpty() {
        // Given
        List<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertFalse(list.isEmpty());
    }

    @Test
    void shouldCheckIfLinkedListContainsElement() {
        // Given
        List<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertTrue(list.contains("two"));
    }

    @Test
    void shouldReturnEmptyLinkedList() {
        // Given
        List<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.clear();
        // Then
        Assertions.assertEquals(0, list.size());
    }

    @Test
    void shouldReturnElementWithGivenIndex() {
        // Given
        List<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertEquals("two", list.get(1));
    }

    @Test
    void shouldAddElementToTheLinkedList() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertEquals(4, list.size());
    }

    @Test
    void shouldRemoveElementFromLinkedList() {
        // Given
        List<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.remove("three");
        // Then
        Assertions.assertEquals("four", list.get(2));
    }

    @Test
    void shouldRemoveAndReturnElementWithGivenIndex() {
        // Given
        List<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertEquals("two", list.remove(1));
    }

    @Test
    void shouldRemoveElementWithGivenIndex() {
        // Given
        List<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.remove(1);
        // Then
        Assertions.assertEquals("three", list.get(1));
    }

    @Test
    void shouldReturnFalseWhenThereIsNoElementInList() {
        // Given
        List<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertFalse(list.remove("five"));
    }

    @Test
    void shouldReturnTrueAfterRemovingElementFromList() {
        // Given
        List<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertTrue(list.remove("two"));
    }

    @Test
    void shouldAddObjectAsTheFirstElementInTheList() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.addFirst("new");
        // Then
        Assertions.assertEquals("new", list.getFirst());
    }

    @Test
    void shouldAddObjectAsTheLastElementInTheList() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.addLast("new");
        // Then
        Assertions.assertEquals("new", list.getLast());
    }

    @Test
    void shouldReturnFirstIndexOfObjectFromList() {
        // Given
        List<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertEquals(3, list.indexOf("four"));
    }

    @Test
    void shouldReturnTrueAfterRemovingObjectFromList() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertTrue(list.removeFirstOccurrence("three"));
    }

    @Test
    void shouldReturnTrueAfterRemovingLastOccurrenceOfObjectInTheList() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("two");
        // Then
        Assertions.assertTrue(list.removeLastOccurrence("two"));
    }

    @Test
    void shouldInsertsElementAtTheFrontOfMyLinkedList() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.offerFirst("new");
        // Then
        Assertions.assertEquals("new", list.getFirst());
    }

    @Test
    void shouldReturnFalseWhenElementIsNull() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertFalse(list.offerFirst(null));
    }

    @Test
    void shouldInsertsElementAtTheEndOfMyLinkedList() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.offerLast("new");
        // Then
        Assertions.assertEquals("new", list.getLast());
    }

    @Test
    void shouldReturnFalseWhenAddedElementIsNull() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertFalse(list.offerLast(null));
    }

    @Test
    void shouldReturnFirstElementFromMyLinkedList() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertEquals("one", list.removeFirst());
    }

    @Test
    void shouldRemoveFirstElementFromMyLinkedList() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.removeFirst();
        // Then
        Assertions.assertEquals("two", list.getFirst());
    }

    @Test
    void shouldReturnLastElementFromMyLinkedList() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertEquals("four", list.removeLast());
    }

    @Test
    void shouldRemoveLastElementFromMyLinkedList() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.removeLast();
        // Then
        Assertions.assertEquals("three", list.getLast());
    }

    @Test
    void shouldRemoveAndReturnFirstElementFromMyLinkedListIfIsNotNull() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertEquals("one", list.pollFirst());
    }

    @Test
    void shouldReturnNullIfMyLinkedListIsEmpty() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.pollFirst();
        // Then
        Assertions.assertNull(list.pollFirst());
    }

    @Test
    void shouldReturnNewSizeOfLinkedListAfterPollFirst() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.pollFirst();
        // Then
        Assertions.assertEquals(1, list.size());
    }

    @Test
    void shouldRemoveAndReturnLastElementFromMyLinkedListIfIsNotEmpty() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        // Then
        Assertions.assertEquals("two", list.pollLast());
    }

    @Test
    void shouldReturnNewSizeOfLinkedListAfterPollLast() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.pollLast();
        // Then
        Assertions.assertEquals(2, list.size());
    }

    @Test
    void shouldReturnNullWhenLinkedListIsEmpty() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.pollLast();
        // Then
        Assertions.assertNull(list.pollLast());
    }

    @Test
    void shouldReturnAndRemoveTheHeadOfList() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        // Then
        Assertions.assertEquals("one", list.poll());
    }

    @Test
    void shouldReturnNullWhenListIsEmpty() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.pollLast();
        // Then
        Assertions.assertNull(list.peek());
    }

    @Test
    void shouldInsertsElementAtTheFrontOfList() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.push("new");
        // Then
        Assertions.assertEquals("new", list.getFirst());
    }

    @Test
    void shouldThrowExceptionWhenLinkedListIsEmpty() {
        // Given
        Deque<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.remove("one");
        // Then
        Assertions.assertThrows(NoSuchElementException.class, list::getLast);
    }

    @Test
    void shouldReturnAndRemoveFirstElementFromList() {
        // Given
        Deque<Integer> list = new MyLinkedList<>();
        // When
        list.add(1);
        list.add(2);
        list.add(3);
        // Then
        Assertions.assertEquals(1, list.pop());
    }

    @Test
    void shouldReturnNullIfThereIsNoElementInTheList() {
        // Given
        Deque<Integer> list = new MyLinkedList<>();
        // When
        list.add(1);
        list.pop();
        // Then
        Assertions.assertNull(list.pop());
    }
}