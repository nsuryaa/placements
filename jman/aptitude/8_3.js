function calculateCharge(units) {
    const freeUnits = 100;
    const rate1 = 2;
    const rate2 = 4;
    const rate3 = 7;

    if (units <= freeUnits) {
        return 0; // First 100 units are free
    } else if (units <= 200) {
        return (units - freeUnits) * rate1;
    } else if (units <= 300) {
        return (200 - freeUnits) * rate1 + (units - 200) * rate2;
    } else {
        ans = (200 - freeUnits) * rate1 + 100 * rate2 + (units - 300) * rate3;
        console.log(ans);
        return ans;
    }
}

// Example usage:
const consumedUnits = 321;
const totalCharge = calculateCharge(consumedUnits);
console.log(`For ${consumedUnits} units, the total charge is ${totalCharge} rupees.`);
