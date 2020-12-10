//Mark Ewert
//Dec 10, 2020

public class RottenPotato {

    public static void main(String[] args) {

        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };

        System.out.println("Movie zero's average rating: " + movieAvgRating(ratings, 0));                    
        System.out.println("Movie one's average rating: " + movieAvgRating(ratings, 1));    
        System.out.println("Reviewer zero's average rating: " + reviewerAvgRating(ratings, 0));    
        System.out.println("Reviewer one's average rating: " + reviewerAvgRating(ratings, 1));
        System.out.println("Average rating for all movies in 2018: " + avgRating2018(ratings));    
        System.out.println("Hardest reviewer is #" + hardestReviewer2018(ratings));
        System.out.println("Worst movie is #" + worstMovie2018(ratings));
    }

    //Question 1
    public static int movieAvgRating(int[][] ratings, int movie) {
        return -1;
    }

    //Question 2
    public static int reviewerAvgRating(int[][] ratings,int reviewer) {
        return -1;        
    }

    //Question 3
    public static int avgRating2018(int[][] ratings) {
        return -1;
    }

    //Question 4
    public static int hardestReviewer2018(int[][] ratings) {
        return -1;
    }

    //question 5
    public static int worstMovie2018(int[][] ratings) {
        return -1;
    }   
}