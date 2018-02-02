/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

/**
 *
 * @author mthoming
 */
public enum Actor {
    
    Father("Benjamin", "He is the leader and provide of the family.", new Point(1,1)),
    Mother("Elizabeth", "She is Benjamin's wife and mother of the family.", new Point(0,1)),
    Son("George", "He is the son of Benjamin and Elizabeth and a hardworking men.", new Point(1,2)),
    Daughter("Emily", "She is the daughter of Benjamin and Elizabeth and a talented lady.", new Point(2,3)),
    Baby("Jacob", "The younges boy of the family.", new Point(1,2)),
    Grandfather("Ronald", "He is Elizabeth's Dad and a sick men.", new Point(1,1)),
    Cousin("Daniel","He is George's and Emily's cousin", new Point(3,4)),
    Aunt("Emma", "She is Daniel's mom and a great cooker.", new Point(5,2)),
   
    
    private String name;
    private String description;
    private Point coordinates;

    Actor(String name, String description, Point coordinates) {
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }
    
    public String getDescription
}
