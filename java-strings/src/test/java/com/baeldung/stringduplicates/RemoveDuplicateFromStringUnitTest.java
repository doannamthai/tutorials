package com.baeldung.stringduplicates;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicateFromStringUnitTest {

    private final static String STR1 = "racecar";
    private final static String STR2 = "J2ee programming";
    private RemoveDuplicateFromString removeDuplicateFromString;

    @Before
    public void executedBeforeEach() {
        removeDuplicateFromString = new RemoveDuplicateFromString();
    }


    @Test
    public void whenUsingCharArray_DuplicatesShouldBeRemovedWithoutKeepingStringOrder() {
        String str1 = removeDuplicateFromString.removeDuplicatesUsingCharArray(STR1);
        String str2 = removeDuplicateFromString.removeDuplicatesUsingCharArray(STR2);
        Assert.assertEquals("ecar", str1);
        Assert.assertEquals("J2e poraming", str2);
    }

    @Test
    public void whenUsingLinkedHashSet_DuplicatesShouldBeRemovedAndItKeepStringOrder() {
        String str1 = removeDuplicateFromString.removeDuplicatesUsinglinkedHashSet(STR1);
        String str2 = removeDuplicateFromString.removeDuplicatesUsinglinkedHashSet(STR2);
        Assert.assertEquals("race", str1);
        Assert.assertEquals("J2e progamin", str2);
    }

    @Test
    public void whenUsingSorting_DuplicatesShouldBeRemovedWithoutKeepingStringOrder() {
        String str1 = removeDuplicateFromString.removeDuplicatesUsingSorting(STR1);
        String str2 = removeDuplicateFromString.removeDuplicatesUsingSorting(STR2);
        Assert.assertEquals("acer", str1);
        Assert.assertEquals(" 2Jaegimnopr", str2);
    }

    @Test
    public void whenUsingHashSet_DuplicatesShouldBeRemovedWithoutKeepingStringOrder() {
        String str1 = removeDuplicateFromString.removeDuplicatesUsingHashSet(STR1);
        String str2 = removeDuplicateFromString.removeDuplicatesUsingHashSet(STR2);
        Assert.assertEquals("arce", str1);
        Assert.assertEquals(" pa2regiJmno", str2);
    }

    @Test
    public void whenUsingIndexOf_DuplicatesShouldBeRemovedWithoutKeepingStringOrder() {
        String str1 = removeDuplicateFromString.removeDuplicatesUsingIndexOf(STR1);
        String str2 = removeDuplicateFromString.removeDuplicatesUsingIndexOf(STR2);
        Assert.assertEquals("ecar", str1);
        Assert.assertEquals("J2e poraming", str2);
    }
}