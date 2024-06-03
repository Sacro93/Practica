package practicas.arrays;
/*getVoteCount({ upvotes: 13, downvotes: 0 }) ➞ 13

getVoteCount({ upvotes: 2, downvotes: 33 }) ➞ -31

getVoteCount({ upvotes: 132, downvotes: 132 }) ➞ 0*/
public class Votes {

    public static int getVoteCount(int upvotes , int downvotes){
        int resultado = upvotes - downvotes;

        return resultado;
    }

    public static void main(String[] args){



        System.out.println(getVoteCount(13,0));
    }
}
