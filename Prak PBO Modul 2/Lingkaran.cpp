#include <iostream>
#include <graphics.h>

void drawCircleMidpoint(int radius) {
    int x = 0;
    int y = radius;
    int p = 1 - radius;

    // Membuat window grafis
    initwindow(800, 800);

    // Langkah iteratif
    while (x <= y) {
        x += 1;
        if (p < 0) {
            p += 2 * x + 1;
        } else {
            y -= 1;
            p += 2 * (x - y) + 1;
        }

        // Gambar titik-titik pada semua kuadran
        putpixel(x, y, WHITE);
        putpixel(y, x, WHITE);
        putpixel(-y, x, WHITE);
        putpixel(-x, y, WHITE);
        putpixel(-x, -y, WHITE);
        putpixel(-y, -x, WHITE);
        putpixel(y, -x, WHITE);
        putpixel(x, -y, WHITE);
    }

    // Tahan layar
    getch();

    // Tutup window grafis
    closegraph();
}

int main() {
    int radius = 20;
    drawCircleMidpoint(radius);
    return 0;
}
