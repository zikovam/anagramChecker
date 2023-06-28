import org.example.AnagramService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramServiceUnitTests {

    @Test
    void prepareCapitalizedStringTest() {
        assertEquals("hello, world!",
                AnagramService.prepareString("Hello, World!"));
    }

    @Test
    void prepareRegularStringTest() {
        assertEquals("hello, world!",
                AnagramService.prepareString("hello, world!"));
    }

    @Test
    void isAnagramMultisetLargeTextTest() {
        String text1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Suspendisse in est ante in nibh mauris. Ac turpis egestas integer eget aliquet nibh praesent tristique magna. Feugiat scelerisque varius morbi enim nunc faucibus. Sem nulla pharetra diam sit. Curabitur vitae nunc sed velit dignissim sodales. Dui nunc mattis enim ut tellus elementum sagittis. Malesuada fames ac turpis egestas. Mattis aliquam faucibus purus in massa. Quis commodo odio aenean sed adipiscing diam donec adipiscing tristique. Duis at tellus at urna condimentum mattis pellentesque id nibh. Eros in cursus turpis massa tincidunt dui ut. Libero volutpat sed cras ornare arcu dui vivamus arcu. Mauris cursus mattis molestie a iaculis at erat pellentesque adipiscing. In pellentesque massa placerat duis ultricies lacus.";
        String text2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Suspendisse in est ante in nibh mauris. Ac turpis egestas reginte eget aliquet nibh praesent tristique magna. Feugiat scelerisque var iusmorbi enim nunc faucibus. Sem nulla pharetra diam sit. Curabitur vitae nunc sed velit dignissim sodales. Dui nunc mattis enim ut tellus elementum sagittis. Malesuada fam esac pistur egestas. Mattis aliquam faucibus purus in massa. Quis commodo odio aenean sed adipiscing diam donec adipiscing tristique. Duis at tellus at urna condimentum mattis pellentesque id nibh. Eros in cursus turpis massa tincidunt dui ut. Libero volutpat sed cras ornare arcu dui vivamus arcu. Mauris cursus mattis molestie a iaculis at erat pellentesque adipiscing. In pellentesque massa placerat duis ultricies lacus.";
        assertTrue(AnagramService.isAnagramMultiset(text1, text2));
    }

    @Test
    void isAnagramSortLargeTextTest() {
        String text1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Suspendisse in est ante in nibh mauris. Ac turpis egestas integer eget aliquet nibh praesent tristique magna. Feugiat scelerisque varius morbi enim nunc faucibus. Sem nulla pharetra diam sit. Curabitur vitae nunc sed velit dignissim sodales. Dui nunc mattis enim ut tellus elementum sagittis. Malesuada fames ac turpis egestas. Mattis aliquam faucibus purus in massa. Quis commodo odio aenean sed adipiscing diam donec adipiscing tristique. Duis at tellus at urna condimentum mattis pellentesque id nibh. Eros in cursus turpis massa tincidunt dui ut. Libero volutpat sed cras ornare arcu dui vivamus arcu. Mauris cursus mattis molestie a iaculis at erat pellentesque adipiscing. In pellentesque massa placerat duis ultricies lacus.";
        String text2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Suspendisse in est ante in nibh mauris. Ac turpis egestas reginte eget aliquet nibh praesent tristique magna. Feugiat scelerisque var iusmorbi enim nunc faucibus. Sem nulla pharetra diam sit. Curabitur vitae nunc sed velit dignissim sodales. Dui nunc mattis enim ut tellus elementum sagittis. Malesuada fam esac pistur egestas. Mattis aliquam faucibus purus in massa. Quis commodo odio aenean sed adipiscing diam donec adipiscing tristique. Duis at tellus at urna condimentum mattis pellentesque id nibh. Eros in cursus turpis massa tincidunt dui ut. Libero volutpat sed cras ornare arcu dui vivamus arcu. Mauris cursus mattis molestie a iaculis at erat pellentesque adipiscing. In pellentesque massa placerat duis ultricies lacus.";
        assertTrue(AnagramService.isAnagramSort(text1, text2));
    }

    @Test
    void isAnagramMultisetTrueTest() {
        String text2 = "anagram";
        String text1 = "gmarana";
        assertTrue(AnagramService.isAnagramMultiset(text1, text2));
    }

    @Test
    void isAnagramSortTrueTest() {
        String text2 = "anagram";
        String text1 = "gmarana";
        assertTrue(AnagramService.isAnagramSort(text1, text2));
    }

    @Test
    void isAnagramMultisetFalseTest() {
        String text2 = "anagram";
        String text1 = "grandma";
        assertFalse(AnagramService.isAnagramMultiset(text1, text2));
    }

    @Test
    void isAnagramSortFalseTest() {
        String text2 = "anagram";
        String text1 = "grandma";
        assertFalse(AnagramService.isAnagramSort(text1, text2));
    }

    @Test
    void isAnagramMultisetEmptyTextTest() {
        String text2 = "";
        String text1 = "";
        assertTrue(AnagramService.isAnagramMultiset(text1, text2));
    }

    @Test
    void isAnagramSortEmptyTextTest() {
        String text2 = "";
        String text1 = "";
        assertTrue(AnagramService.isAnagramSort(text1, text2));
    }

    @Test
    void isAnagramMultisetDifferentSizesTextTest() {
        String text2 = "Anagram";
        String text1 = "Gram";
        assertFalse(AnagramService.isAnagramMultiset(text1, text2));
    }

    @Test
    void isAnagramSortDifferentSizesTextTest() {
        String text2 = "Anagram";
        String text1 = "Gram";
        assertFalse(AnagramService.isAnagramSort(text1, text2));
    }
}
