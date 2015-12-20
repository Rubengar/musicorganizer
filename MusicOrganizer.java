import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    
    private boolean indiceValido;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index) == true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index) == true) {
            files.remove(index);
        }
    }
    /**
     * Metodo que comprueba si el indice es corecto
     */
    public void checkIndex(int index)
    {
        if (validIndex(index) == false)
        {
            System.out.println("ERROR Debe introducir un numero entre 0 y " + (files.size()-1));
        }
    }
    /**
     * Metodo que devuelve un valor booleano dependiendo de si el indice introducido
     * es valido o no.
     */
    public boolean validIndex(int index)
    {
         if (index < 0 || index >= files.size())
         {
            indiceValido = false;
            return indiceValido;
         }
         else
         {
            indiceValido = true;
            return indiceValido;
         }
    }
}
