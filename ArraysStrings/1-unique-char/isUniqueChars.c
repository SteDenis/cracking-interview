#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

const int MAX_CHAR = 128;

bool uniqueCharacters(char *str)
{
     int len = strlen(str);
     if (len > MAX_CHAR) {
      return false;
     }

    bool chars[MAX_CHAR];
    for (int j = 0; j < MAX_CHAR; j++) {
      chars[j] = false;
    }
    for (int i = 0; i < len; i++) {
        int val = (int)str[i];
        if (chars[val] == true)
            return false;
        chars[val] = true;
    }
    return true;
}

int main(int argc, char **ag)
{
    if (argc <= 1)
    {
      printf("usage: ./a.out [string]");
      return 0;
    }
    char *str = ag[1];
    if (uniqueCharacters(str)) {
        printf("The string %s has different chars", str);
    } else {
        printf("The string %s has same chars", str);
    }
    return 0;
}
