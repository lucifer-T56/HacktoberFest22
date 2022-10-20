const stringSimilarity = (s) => {
  const n = s.length;
  let z = [];
  let left = 0;
  let right = 0;

  // initiate index 0 with 0
  z[0] = 0;

  for (let i = 0; i < n; i++) {
    if (i > right) {
      left = right = i;

      // create z box
      while (right < n && s[right] === s[right - left]) {
        right++;
      }

      z[i] = right - left;
      right--;
    } else {
      const j = i - left;

      if (z[j] < right - i + 1) {
        // check if value + index within z box
        z[i] = z[j];
      } else {
        // reset the z box
        left = i;

        while (right < n && s[right] === s[right - left]) {
          right++;
        }

        z[i] = right - left;
        right--;
      }
    }
  }

  const sum = n + z.reduce((sums, val) => sums + val, 0);

  console.log({ sum, z });

  return sum;
};

stringSimilarity("abaacabaaxa");