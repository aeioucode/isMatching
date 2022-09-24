package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import match.MatchingDelimiters;

public class TestMatchingDelimiters {
	
	@Test
	public void testIsMatching() {
		assertTrue(MatchingDelimiters.isMatched("{a, (b), [1]}"));
	}
	
	@Test
	public void testIsMatchingNoClosing() {
		assertFalse(MatchingDelimiters.isMatched("{a, (b), [1}"));
	}
	
	@Test
	public void testIsMatchingNoOpening() {
		assertFalse(MatchingDelimiters.isMatched("{a, b), [1]}"));
	}
}
