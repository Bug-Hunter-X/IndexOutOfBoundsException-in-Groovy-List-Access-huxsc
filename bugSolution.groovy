def list = [1, 2, 3]

// Solution 1: Safe navigation operator
println list[3]?.toString() ?: "Index out of bounds"

// Solution 2: Check index bounds
if (3 < list.size()) {
  println list[3]
} else {
  println "Index out of bounds"
}

//Solution 3: Using the elvis operator
println list.get(3) ?: "Index out of bounds"