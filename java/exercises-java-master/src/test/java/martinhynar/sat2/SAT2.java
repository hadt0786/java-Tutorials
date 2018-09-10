package martinhynar.sat2;

/**
 * In this assignment you will implement one or more algorithms for the 2SAT problem.
 * The file format is as follows. In each instance, the number of variables and the number of clauses is the same,
 * and this number is specified on the first line of the file. Each subsequent line specifies a clause via its two
 * literals, with a number denoting the variable and a "-" sign denoting logical "not". For example, the second line
 * of the first data file is "-16808 75250", which indicates the clause NOT x16808 OR x75250.
 * <p/>
 * Your task is to determine which of the 6 instances are satisfiable, and which are unsatisfiable.
 * In the box below, enter a 6-bit string, where the ith bit should be 1 if the ith instance is satisfiable,
 * and 0 otherwise. For example, if you think that the first 3 instances are satisfiable and the last 3 are not,
 * then you should enter the string 111000 in the box below.
 * <p/>
 * DISCUSSION: This assignment is deliberately open-ended, and you can implement whichever 2SAT algorithm you want.
 * For example, 2SAT reduces to computing the strongly connected components of a suitable graph (with two vertices per
 * variable and two directed edges per clause, you should think through the details). This might be an especially
 * attractive option for those of you who coded up an SCC algorithm for Part I of this course. Alternatively, you can
 * use Papadimitriou's randomized local search algorithm. (The algorithm from lecture might be too slow,
 * so you might want to make one or more simple modifications to it to ensure that it runs in a reasonable amount
 * of time.) A third approach is via backtracking. In lecture we mentioned this approach only in passing;
 * see the DPV book (http://www.cs.berkeley.edu/~vazirani/algorithms/chap9.pdf), for example, for more details.
 *
 * @author mhynar
 * @since 2013-Oct-17
 */
public class SAT2 {
}
