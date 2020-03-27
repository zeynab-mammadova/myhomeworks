package classes;

import az.company.classes.lesson21.InvertString;
import az.company.classes.lesson24.IsPalindrome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InvertStringTest {

  private InvertString is;

  @BeforeEach
  void before() {
    is = new InvertString();
  }

  @Test
  void invert1() {
    assertEquals("abc", is.invert("ABC"));
  }

  @Test
  void invert2() {
    assertEquals("hELLOwORLD", is.invert("HelloWorld"));
  }

  @Test
  void invert3() {
    assertEquals("abcdef", is.invert("ABCDEF"));
  }

  @Test
  void invert4() {
    assertEquals("", is.invert(""));
  }

    static class IsPalindromeTest {

      private IsPalindrome p;

      @BeforeEach
      void setUp() {
        this.p = new IsPalindrome();
      }

      @Test
      void check1() {
        assertTrue(p.check(1));
      }

      @Test
      void check2() {
        assertTrue(p.check(121));
      }

      @Test
      void check3() {
        assertTrue(p.check(123454321));
      }

      @Test
      void check4() {
        assertFalse(p.check(123));
      }

      @Test
      void check5() {
        assertFalse(p.check(123521));
      }

      @Test
      void check6() {
        assertFalse(p.check(99));
      }
    }
}
