import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    public void testLAppearsThreeTimesInHelloWorld() //make name descriptive since you get better error codes 
    {
//Arrange
CharacterFrequencyCounter counter = new CharacterFrequencyCounter ("hello world");

//Act
int actualCount = counter.getFrequency('l'); //character aka char only uses single quotes

//Assert
assertEquals(3, actualCount);

    }

public void testNonOccurringCharacterPercentageIsZero()
{

@Test

//Arrange
CharacterFrequencyCounter counter = new CharacterFrequencyCounter ("hiThere");

//Act
double actualPercentage = counter.getRelativePercentage('z');

//Assert

assertEquals(0.0, actualPercentage, 0.001);

}

}