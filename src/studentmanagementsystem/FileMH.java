/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import Hus.Monhoc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileMH {
    File f = new File("C:\\Users\\nguye\\Documents\\Data\\ListMonHoc.csv");
    public void ghiMH(ArrayList<Monhoc> list)
    {
        
        try{
            if(!f.exists())
                f.createNewFile();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(list);
//            for (Monhoc mh : list) {
//                oos.writeObject(mh.toMonHoc() + "\n");
//            }
            oos.close();
        }   
        catch(Exception e){}
    }
    
    public ArrayList<Monhoc> docMH() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        if(!f.exists())
            return new ArrayList<Monhoc>();
        ObjectInputStream ois =new  ObjectInputStream(new FileInputStream(f));
        return (ArrayList<Monhoc>)ois.readObject();
    }
}
