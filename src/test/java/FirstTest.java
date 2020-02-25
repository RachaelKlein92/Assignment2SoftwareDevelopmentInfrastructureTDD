import Main.Animals;
import org.junit.*;


import static org.junit.Assert.*;



public class FirstTest  {

    @Before
    public void setUp() throws Exception {

    }


    @After
    public void tearDown() throws Exception {

    }


    //1
    // Failing Test
    //this test will fail because the expected output is 24 and the
    // answer that we are comparing it to is not 24, 2 * 2 is not 24.
    @Test
    public void aTestCalcMethodThatWillFail() {
        Animals animal = new Animals();
        assertNotNull(animal);
        assertEquals(24, animal.add(2));

    }

    //2
    // Timeouts
    //not completed in 9secs, this test will terminate
    @Test(timeout = 9000)
    public void twoAnimalsAreNotTheSame_True() {
        //checking to see if the first variable points to the same object in memory in the second variable. - true
        //set to true, because it's expected to fail
        //Object Identity
        Animals animal1 = new Animals();
        Animals animal2 = new Animals();
        //telling them that they should not equal, if so, this test will pass
        assertNotEquals(animal1, animal2);

    }

    @Test(timeout = 9000)
    public void TwoAnimalsAreTheSame_True() {
        //checking to see if the first variable points to the same object in memory in the second variable. - true
        //Object Identity
        Animals animal1 = new Animals(2);
        Animals animal2 = animal1;
        //telling them that they should equal
        assertEquals(animal1, animal2);
    }

    //DisablingTest comes with a added note :P
    @Ignore("Skip until method is completed.")
    public void stopit(){
        System.out.println("This will not run, because i am  DisablingTest with the @Annotation");
        assertEquals(1,2);
    }

    // Object Equality
    //checks that the object content are equal
    @Test
    public void objEquals() {
        Animals animal1 = new Animals();
        Animals animal2 = new Animals();
        //animal2.howManyTimeItEats = 3;

        assertTrue(animal1.equals(animal2));
    }




}
