
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Test
{
    /**
    * Metodo que permite probar el metodo checkIndex()
     */
    public void testCheckIndex(int index)
    {   
        MusicOrganizer prueba = new MusicOrganizer();
        prueba.addFile("Tremor.mp3");
        prueba.addFile("Tsunami.mp3");
        prueba.addFile("PingPong.mp3");
        
        System.out.println("Probando el metodo checkIndex");
        prueba.checkIndex(index);
    }
    /**
     * Metodo que permite probar el metodo validIndex()
     */
    public void testValidIndex(int index)
    {
        MusicOrganizer prueba = new MusicOrganizer();
        prueba.addFile("Tremor.mp3");
        prueba.addFile("Tsunami.mp3");
        prueba.addFile("PingPong.mp3");
        
        System.out.println("Probando el metodo validindex");
        prueba.validIndex(index);
    }
    /**
     * Metodo que permite probar el metodo listFile()
     */
    public void testListFile(int index)
    {
        MusicOrganizer prueba = new MusicOrganizer();
        prueba.addFile("Tremor.mp3");
        prueba.addFile("Tsunami.mp3");
        prueba.addFile("PingPong.mp3");
        
        System.out.println("Probando el metodo listFiles");
        prueba.listFile(index);
    }
    /**
     * Metodo que permite probar el metodo removeFile()
     */
    public void testRemoveFiles(int index)
    {
        MusicOrganizer prueba = new MusicOrganizer();
        prueba.addFile("Tremor.mp3");
        prueba.addFile("Tsunami.mp3");
        prueba.addFile("PingPong.mp3");
        
        System.out.println("Probando el metodo removeFiles");
        prueba.removeFile(index);
    }
}
