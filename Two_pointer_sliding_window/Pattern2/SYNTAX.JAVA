// variable -size window 
// (condition based ))

int left = 0, sum = 0, res = 0;
for (int right = 0; right < n; right++) {
    sum += arr[right];
    while (sum > k) {
        sum -= arr[left];
        left++;
    }
    res = Math.max(res, right - left + 1);
}
