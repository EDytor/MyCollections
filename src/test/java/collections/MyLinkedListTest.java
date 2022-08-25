package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

    @Test
    void shouldReturnSizeOfMyLinkedList() {
        // Given
        MyLinkedList<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        // Then
        Assertions.assertEquals(5, list.size);
    }

    @Test
    void shouldReturnFalseWhenLinkedListIsNotEmpty() {
        // Given
        MyLinkedList<String> list = new MyLinkedList<>();
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
        MyLinkedList<String> list = new MyLinkedList<>();
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
        MyLinkedList<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.clear();
        // Then
        Assertions.assertEquals(0,list.size);
    }

    @Test
    void shouldReturnElementWithGivenIndex() {
        // Given
        MyLinkedList<String> list = new MyLinkedList<>();
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
        MyLinkedList<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println("size: " + list.size);
        // Then
        Assertions.assertEquals(4, list.size);
    }

    @Test
    void shouldRemoveElementFromLinkedList() {
        // Given
        MyLinkedList<String> list = new MyLinkedList<>();
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
        MyLinkedList<String> list = new MyLinkedList<>();
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
        MyLinkedList<String> list = new MyLinkedList<>();
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
        MyLinkedList<String> list = new MyLinkedList<>();
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
        MyLinkedList<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertTrue(list.remove("two"));
    }
    @Test
    void shouldAddObjectAsTheFirstElementInTheList(){
        // Given
        MyLinkedList<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.addFirst("new");
        // Then
        Assertions.assertEquals("new", list.get(0));
    }
    @Test
    void shouldAddObjectAsTheLastElementInTheList(){
        // Given
        MyLinkedList<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.addLast("new");
        // Then
        Assertions.assertEquals("new", list.get(4));
    }
    @Test
    void shouldReturnFirstIndexOfObjectFromList(){
        // Given
        MyLinkedList<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        Assertions.assertEquals(3, list.indexOf("four"));
    }
    @Test
    void shouldReturnTrueAfterRemovingObjectFromList(){
        // Given
        MyLinkedList<String> list = new MyLinkedList<>();
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
    void shouldReturnTrueAfterRemovingLastOccurrenceOfObjectInTheList(){
        // Given
        MyLinkedList<String> list = new MyLinkedList<>();
        // When
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("two");
        // Then
        Assertions.assertTrue(list.removeLastOccurrence("two"));
    }
}