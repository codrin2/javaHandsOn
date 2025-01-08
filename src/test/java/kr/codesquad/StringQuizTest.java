package kr.codesquad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringQuizTest {

    @Test
    @DisplayName("같은 문자열의 해시코드 비교 ")
    public void compareStringHashCode() {
        String abc1 = "abc";
        String abc2 = new String("abc");

        assertNotSame(abc1, abc2);
        assertEquals(abc1.hashCode(), abc2.hashCode());

        int hash1 = System.identityHashCode(abc1);
        int hash2 = System.identityHashCode(abc2);
        assertNotEquals(hash1, hash2);
    }

    @Test
    @DisplayName("문자열 길이 구하기")
    public void test_stringLongLong() throws Exception {
        String teacher = "Honux";

        assertEquals(teacher.length(),5);
    }

    @Test
    @DisplayName("문자열 합치기")
    public void assembleStrings() throws Exception {
        String teacher = "Crong";
        String frontend = "Hello";

        assertEquals("CrongHello", teacher + frontend);
    }

    @Test
    @DisplayName("string 을 char 단위로 각각 출력")
    public void testPrintStringAsAChar() throws Exception {
        String teacher = "Pobi";
        char[] expectedChars = {'P', 'o', 'b', 'i'};

        char[] actualChars = teacher.toCharArray();
        assertEquals(expectedChars.length, actualChars.length);

        for (int i = 0; i < actualChars.length; i++) {
            assertEquals(expectedChars[i], actualChars[i]);
            System.out.println(expectedChars[i]);
        }
    }

    @Test
    @DisplayName("+을 이용해 String을 거꾸로 출력하기")
    public void stringReversedWithPlus() throws Exception {
        String teacher = "Dangle";
        String reversed = "";

        for (int i = teacher.length() - 1; i >= 0; i--) {
            reversed += teacher.charAt(i);
        }

        assertEquals("elgnaD", reversed);
        System.out.println(reversed);
    }


    @Test
    @DisplayName("StringBuilder을 이용해 String을 거꾸로 출력하기")
    public void 문자열_뒤집기() throws Exception {
        String developer = "Zello";
        StringBuilder sb = new StringBuilder();

        sb.append(developer).reverse();

        assertEquals("olleZ", sb.toString());
        System.out.println(sb);
    }
}