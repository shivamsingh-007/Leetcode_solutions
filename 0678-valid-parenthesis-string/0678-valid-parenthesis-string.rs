impl Solution {
    pub fn check_valid_string(s: String) -> bool {
        let bytes = s.as_bytes();
        let mut balance = 0;
        for &b in bytes {
            if b == b'(' || b == b'*' {
                balance += 1;
            } else { 
                balance -= 1;
            }
            if balance < 0 {
                return false;
            }
        }

        let mut balance = 0;
        for &b in bytes.iter().rev() {
            if b == b')' || b == b'*' {
                balance += 1;
            } else { 
                balance -= 1;
            }
            if balance < 0 {
                return false;
            }
        }

        true
    }
}