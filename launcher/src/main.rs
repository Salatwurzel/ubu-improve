use std::process::Command;

fn main() {
    let _ = Command::new("bin/ubu_improve").spawn().unwrap();
}
