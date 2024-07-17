/** @author Zima Jalil
 * @version 2.0
 * @since 2024
 */
package Zeema.sp;

/**
 * @author zimaj
 *
 * Class for library
 */
public class Book {
    /**
     * @value 10 default value
     */
    static int value=10;
    /**
     * Parametrized Constructor
     * @param s Book Name
     */
    public Book (String s){
    }

    /**
     * Issue a book to student
     * @param roll roll number of a student
     * @throws Exception if book is not availabe,throws Exception
     */
    public void issue(int roll) throws Exception {
    }

    /**
     * check if book is avaiable
     * @param str Book name
     * @return if book is return true else false
     */
    public boolean available (String str){
        return true;
    }

    /**
     * Get book naem
     * @param id book d
     * @return book name
     */
    public String getName(int id){
        return "";
    }
}
