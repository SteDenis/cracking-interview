export default class isUniqueChars {
  // Complexity time O(n) and complexity space O(1)
  static isUniqueChars(str) {
    if (str.length > 128) return false;

    const charset = {};
    for (let i = 0; i < str.length; i++) {
      let val = str.charAt(i);
      if (charset[val]) {
        return false;
      }
      charset[val] = true;
    }
    return true;
  }
}
