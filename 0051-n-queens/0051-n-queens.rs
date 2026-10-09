impl Solution {
    pub fn solve_n_queens(n: i32) -> Vec<Vec<String>> {
        let     n         = n as usize;
        let mut qset      = QueenSet::new(n);
        let mut board     = vec![vec!['.'; n]; n];
        let mut solutions = vec![];

        backtrack(0, &mut qset, &mut board, &mut solutions);

        solutions
    }
}

fn backtrack(row       : usize,
             qset      : &mut QueenSet,
             board     : &mut Vec<Vec<char>>, 
             solutions : &mut Vec<Vec<String>>) {

    let n = board.len();

    if row == n {
        solutions.push(board.iter().map(|r| r.iter().collect()).collect());
    } else {
        for col in 0..n {
            if !qset.is_attacked(row, col) {
                qset.insert_queen(row, col);
                board[row][col] = 'Q';

                backtrack(row + 1, qset, board, solutions);
                
                board[row][col] = '.';
                qset.remove_queen(row, col);
            }
        }
    }
}

struct QueenSet {
    size: usize,
    diag: Vec<bool>,
    rows: Vec<bool>,
    cols: Vec<bool>,
}
impl QueenSet {
    fn new(n: usize) -> Self {
        Self {
            size: n,
            diag: vec![false; 4 * n - 2],
            rows: vec![false; n],
            cols: vec![false; n],
        }
    }
    fn update(&mut self, row: usize, col: usize, value: bool) {
        self.rows[row] = value;
        self.cols[col] = value;
        self.diag[row + col] = value;
        self.diag[3 * self.size - 2 - row + col] = value;
    }
    fn insert_queen(&mut self, row: usize, col: usize) {
        self.update(row, col, true);
    }
    fn remove_queen(&mut self, row: usize, col: usize) {
        self.update(row, col, false);
    }
    fn is_attacked(&self, row: usize, col: usize) -> bool {
        self.rows[row] |
        self.cols[col] | 
        self.diag[row + col] |
        self.diag[3 * self.size - 2 - row + col]
    }
}