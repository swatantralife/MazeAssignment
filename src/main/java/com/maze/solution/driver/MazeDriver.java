package com.maze.solution.driver;

import java.io.File;
import java.util.List;

import com.maze.solution.executor.SolveMaze;
import com.maze.solution.model.Coordinate;

public class MazeDriver {
	
	public static void main(String[] args) throws Exception {
		File maze = new File("src/main/resources/Maze.txt");

        execute(maze);
	}
	
	private static void execute(File file) throws Exception {
        Maze maze = new Maze(file);
        dfs(maze);
    }

 

    private static void dfs(Maze maze) {
        SolveMaze dfs = new SolveMaze();
        List<Coordinate> path = dfs.solve(maze);
        maze.printPath(path);
        maze.reset();
    }
}
