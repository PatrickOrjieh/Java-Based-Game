/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orjieh_patrick_sd1c_project2;

/**
 *
 * @author orjie
 */
//public class Player implements Comparable <Player> {
//    
//    
//}
public class Player implements Comparable <Player> {
    
    //Attributes Or Field for Players
    private String namep;
    private String dateOfBirth;
    private int shirtNo;
    private String position;
    private String foot;
    private double height;
    private double weight;
    private String nationality;
    private double marketValue;
    
    
    //possible constructors

    /**
     * below are the list of attributes for the Player class
     * @param namep
     * @param dateOfBirth
     * @param shirtNo
     * @param position
     * @param foot
     * @param height
     * @param weight
     * @param nationality
     * @param marketValue
     */
    public Player(String namep, String dateOfBirth, int shirtNo, String position,
                  String foot,double height, double weight, String nationality, double marketValue)
    {
    
    this.namep = namep;
    this.dateOfBirth = dateOfBirth;
    this.shirtNo = shirtNo;
    this.position = position;
    this.foot = foot;
    this.height = height;
    this.weight = weight;
    this.nationality = nationality;
    this.marketValue = marketValue;
    
    }
    
    /**
     *
     * @param namep
     * @param dateOfBirth
     * @param shirtNo
     * @param position
     * @param foot
     * @param height
     * @param weight
     * @param nationality
     */
    public Player(String namep, String dateOfBirth, int shirtNo, String position,
                  String foot,double height, double weight, String nationality)
    {
    
    this.namep = namep;
    this.dateOfBirth = dateOfBirth;
    this.shirtNo = shirtNo;
    this.position = position;
    this.foot = foot;
    this.height = height;
    this.weight = weight;
    this.nationality = nationality;
    this.marketValue = -1;
    
    }
    
    /**
     *
     * @param namep
     * @param shirtNo
     */
    public Player(String namep,int shirtNo)
    {
    
    this.namep = namep;
    this.dateOfBirth = null;
    this.shirtNo = shirtNo;
    this.position = null;
    this.foot = null;
    this.height = -1;
    this.weight = -1;
    this.nationality = null;
    this.marketValue = -1;
    
    }
    
    /**
     *
     * @param position
     * @param shirtNo
     * @param foot
     */
    public Player(String position, int shirtNo, String foot)
    {
    
    this.namep = null;
    this.dateOfBirth = null;
    this.shirtNo = shirtNo;
    this.position = position;
    this.foot = foot;
    this.height = -1;
    this.weight = -1;
    this.nationality = null;
    this.marketValue = -1;
    
    }
    
    /**
     *
     * @param namep
     * @param dateOfBirth
     * @param position
     * @param foot
     * @param nationality
     */
    public Player(String namep, String dateOfBirth,String position, String foot,String nationality)
    {
    
    this.namep = namep;
    this.dateOfBirth = dateOfBirth;
    this.shirtNo = -1;
    this.position = position;
    this.foot = foot;
    this.height = -1;
    this.weight = -1;
    this.nationality = nationality;
    this.marketValue = -1;
    
    }
    
    /**
     *
     * @param height
     */
    public Player(double height)
    {
    
    this.namep = null;
    this.dateOfBirth = null;
    this.shirtNo = -1;
    this.position = null;
    this.foot = null;
    this.height = height;
    this.weight = -1;
    this.nationality = null;
    this.marketValue = -1;
    
    }
    
    /**
     *
     * @param shirtNo
     * @param marketValue
     */
    public Player(int shirtNo, double marketValue)
    {
    
    this.namep = null;
    this.dateOfBirth = null;
    this.shirtNo = shirtNo;
    this.position = null;
    this.foot = null;
    this.height = -1;
    this.weight = -1;
    this.nationality = null;
    this.marketValue = marketValue;
    
    }
    
    /**
     *
     * @param namep
     * @param dateOfBirth
     * @param position
     * @param foot
     */
    public Player(String namep, String dateOfBirth,String position,String foot)
    {
    
    this.namep = namep;
    this.dateOfBirth = dateOfBirth;
    this.shirtNo = -1;
    this.position = position;
    this.foot = foot;
    this.height = -1;
    this.weight = -1;
    this.nationality = null;
    this.marketValue = -1;
    
    }
    
    /**
     *
     * @param namep
     * @param marketValue
     */
    public Player(String namep, double marketValue)
    {
    
    this.namep = namep;
    this.dateOfBirth = null;
    this.shirtNo = -1;
    this.position = null;
    this.foot = null;
    this.height = -1;
    this.weight = -1;
    this.nationality = null;
    this.marketValue = marketValue;
    
    }
    
    /**
     *
     * @param namep
     * @param position
     * @param foot
     */
    public Player(String namep,String position,String foot)
    {
    
    this.namep = namep;
    this.dateOfBirth = null;
    this.shirtNo = -1;
    this.position = position;
    this.foot = foot;
    this.height = -1;
    this.weight = -1;
    this.nationality = null;
    this.marketValue = -1;
    
    }
    
    /**
     *
     * @param marketValue
     * @param position
     */
    public Player(double marketValue, String position)
    {
    
    this.namep = null;
    this.dateOfBirth = null;
    this.shirtNo = -1;
    this.position = position;
    this.foot = null;
    this.height = -1;
    this.weight = -1;
    this.nationality = null;
    this.marketValue = marketValue;
    
    }
    
    /**
     *
     * @param namep
     * @param position
     */
    public Player(String namep, String position)
    {
    
    this.namep = namep;
    this.dateOfBirth = null;
    this.shirtNo = -1;
    this.position = position;
    this.foot = null;
    this.height = -1;
    this.weight = -1;
    this.nationality = null;
    this.marketValue = -1;
    
    }
    
    /**
     *
     * @param shirtNo
     */
    public Player(int shirtNo)
    {
    
    this.namep = null;
    this.dateOfBirth = null;
    this.shirtNo = shirtNo;
    this.position = null;
    this.foot = null;
    this.height = -1;
    this.weight = -1;
    this.nationality = null;
    this.marketValue = -1;
    
    }
    
    /**
     *
     * @param namep
     */
    public Player(String namep)
    {
    
    this.namep = namep;
    this.dateOfBirth = null;
    this.shirtNo = -1;
    this.position = null;
    this.foot = null;
    this.height = -1;
    this.weight = -1;
    this.nationality = null;
    this.marketValue = -1;
    
    }
    
    //no argument constructor

    /**
     *
     */
    public Player(){
        
    this.namep = null;
    this.dateOfBirth = null;
    this.shirtNo = -1;
    this.position = null;
    this.foot = null;
    this.height = -1;
    this.weight = -1;
    this.nationality = null;
    this.marketValue = -1;
    }
    
    
    // getters

    /**
     * gets the name of the player
     * @return the name of the player
     */
    public String getNamep()
    {
        return namep;
    }
    
    /**
     *gets the date of birth of the player
     * @return the date of birth of the player
     */
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    /**
     *gets the shirt number of the player
     * @return the shirt number of the player
     */
    public int getShirtNo()
    {
        return shirtNo;
    }
    
    /**
     *gets the position of the player
     * @return the position of the player
     */
    public String getPosition()
    {
        return position;
    }
    
    /**
     *gets the foot of the player
     * @return the preferred of the player
     */
    public String getFoot()
    {
        return foot;
    }
    
    /**
     *gets the height of the player
     * @return the height of the player
     */
    public double getHeight()
    {
        return height;
    }
    
    /**
     *gets the weight of the player
     * @return the weight of the player
     */
    public double getWeight()
    {
        return weight;
    }
    
    /**
     *gets the nationality of the player
     * @return the nationality of the player
     */
    public String getNationality()
    {
        return nationality;
    }
    
    /**
     *gets the marketValue of the player
     * @return the marketValue of the player
     */
    public double getMarketValue()
    {
        return marketValue;
    }
    
    
    //setters

    /**
     *changes the name of the player
     * @param namep new name for the player
     */
    public void setNamep(String namep)
    {
        this.namep = namep;
    }
    
    /**
     *changes the dateOfBirth of the player
     * @param dateOfBirth new dateOfBirth for the player
     */
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }
    
    /**
     *changes the shirt number of the player
     * @param shirtNo new shirt number for the player
     */
    public void setShirtNo(int shirtNo)
    {
        this.shirtNo = shirtNo;
    }
    
    /**
     *changes the position of the player
     * @param position new position for the player
     */
    public void setPosition(String position)
    {
        this.position = position;
    }
    
    /**
     *changes the foot of the player
     * @param foot new foot for the player
     */
    public void setFoot(String foot)
    {
        this.foot = foot;
    }
    
    /**
     *changes the height of the player
     * @param height new height for the player
     */
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    /**
     *changes the weight of the player
     * @param weight new weight for the player
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    
    /**
     *changes the nationality of the player
     * @param nationality new nationality for the player
     */
    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }
    
    /**
     *changes the marketValue of the player
     * @param marketValue new marketValue for the player
     */
    public void setMarketValue(double marketValue)
    {
        this.marketValue = marketValue;
    }
    
    //toString 

    /**
     *default string form of the player object
     * @return the string showing all values for the attributes of the player
     */
    
    public String toString(){
        
        return "\nPlayer Name: " + namep + "\t Date Of Birth: " + dateOfBirth + "\t Jersey Number: " + shirtNo
               + "\t Position: " + position + "\t Preferred Foot: " + foot + "\t Height: " + height
               + "cm\t Weight: " + weight + "kg\t Nationality: " + nationality + "\t Market Value: " + marketValue + "€m";
    }
    
    //equals

    /**
     *
     * @param otherObject
     * @return
     */
    public boolean equals(Player otherObject)
    {
        if(otherObject == null)
        {
            return false;
        }else if(getClass() != otherObject.getClass())
        {
            return false;
        }
        else 
        {
            Player otherPlayer = (Player) otherObject;
            return (namep.equals(otherPlayer.namep)
                    &&dateOfBirth.equals(otherPlayer.dateOfBirth)
                    &&shirtNo == (otherPlayer.shirtNo)
                    &&position.equals(otherPlayer.position)
                    &&foot.equals(otherPlayer.foot)
                    &&height == (otherPlayer.height)
                    &&weight == (otherPlayer.weight)
                    &&nationality.equals(otherPlayer.nationality)
                    &&marketValue == (otherPlayer.marketValue));
        }        
    }
    
    //compare to 

    /**
     *the sorting parameter used for the collections
     * @param other
     * @return this.marketvalue sorted form
     */
        public int compareTo(Player other)
    {
        if(this.marketValue < other.marketValue)
        {
            return -1;
        }
        else if (this.marketValue > other.marketValue)
        {
            return 1;
        }
        else
        {
            return 0;
        }     
    }
       
    
    
}
