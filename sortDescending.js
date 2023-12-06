unction sortDescending(arr) {
    return arr.sort(function(a, b) {
        return b - a; 
    });
}

const numbers = [5, 2, 8, 1, 7];
const sortedDescending = sortDescending(numbers);

console.log("Original Array:", numbers);
console.log("Sorted in Descending Order:", sortedDescending)