package edu.jalc.trumpet;

class EtchingTest{
   
   public void testGetNumberOfEtchings() throws Exception {
      System.out.println("Testing Etching::getNumberOfEtchings");
      Etching etching = new Etching(null);
      assert(etching.getNumberOfEtchings() == 27);
   }
   
   public static void main(String[] args) throws Exception{
      EtchingTest etchingTest = new EtchingTest();
      etchingTest.testGetNumberOfEtchings();
      System.out.println("EtchingTest complete");
   }
}