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
    public static double movieAvgRating(int[][] ratings, int movie) {
        double sum = 0.0;
        for (int r = 0; r < ratings.length; r++){
            sum += ratings[r][movie];
        }
        return sum / (ratings.length);
    }

    //Question 2
    public static double reviewerAvgRating(int[][] ratings,int reviewer) {
        double sum = 0.0;
        for (int c = 0; c < ratings[0].length; c++){
            sum += ratings[reviewer][c];
        }
        return sum / (ratings[0].length);
    }

    //Question 3
    public static double avgRating2018(int[][] ratings) {
        double sum = 0.0;
        for (int r = 0; r < ratings.length; r++){
            for (int c = 0; c < ratings[0].length; c++){
                sum += ratings[r][c];
            }
        }
        return sum / (ratings.length * ratings[0].length);
    }

    //Question 4
    public static int hardestReviewer2018(int[][] ratings) {
        double hardest = reviewerAvgRating(ratings, 0);
        int rowNum = 0;
        for (int r = 0; r < ratings.length; r++){
            if (reviewerAvgRating(ratings, r) < hardest){
                rowNum = r;
                hardest = reviewerAvgRating(ratings, r);
            }
        }
        return rowNum;
    }

    //question 5
    public static int worstMovie2018(int[][] ratings) {
        double worst = movieAvgRating(ratings, 0);
        int colNum = 0;
        for (int c = 0; c < ratings[0].length; c++){
            if (movieAvgRating(ratings, c) < worst){
                colNum = c;
                worst = reviewerAvgRating(ratings, c);
            }
        }
        return colNum;
    }   
}