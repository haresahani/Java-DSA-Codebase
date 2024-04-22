/*An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.

 
Output: [[2,2,2],[2,2,0],[2,0,1]]
*/

import java.util.*;

public class FloodFillAlgo {

    public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {
        // Base case: check boundaries and if already visited or color does not match
        // original color
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }
        // Mark the current pixel as visited
        vis[sr][sc] = true;
        // Update the color of the current pixel
        image[sr][sc] = color;

        // Recursively call helper function for the four possible directions (up, down,
        // left, right)
        helper(image, sr - 1, sc, color, vis, orgCol); // Up
        helper(image, sr + 1, sc, color, vis, orgCol); // Down
        helper(image, sr, sc - 1, color, vis, orgCol); // Left
        helper(image, sr, sc + 1, color, vis, orgCol); // Right
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Get the original color at the starting point
        int orgCol = image[sr][sc];
        // Create a visited array to track visited pixels
        boolean[][] vis = new boolean[image.length][image[0].length];
        // Call the helper function to perform flood fill
        helper(image, sr, sc, color, vis, orgCol);
        // Return the modified image
        return image;
    }

    public static void main(String[] args) {
        FloodFillAlgo floodFill = new FloodFillAlgo();

        // Define the input image and parameters
        int[][] image = {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 }
        };
        int sr = 1; // Starting row
        int sc = 1; // Starting column
        int color = 2; // New color

        // Perform the flood fill and get the modified image
        int[][] modifiedImage = floodFill.floodFill(image, sr, sc, color);

        // Print the modified image
        for (int[] row : modifiedImage) {
            System.out.println(Arrays.toString(row));
        }
    }
}
