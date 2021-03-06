package by.chebotar.Input;

import by.chebotar.Entity.TetrahedFactory;
import by.chebotar.Exceptions.InvalidPathException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ParametrsRead {

  private static final Logger LOGGER = LogManager.getLogger(TetrahedFactory.class);

  public List<String> getParametrs(Path path) throws InvalidPathException {
    List<String> parametrs;
    try{
      parametrs = Files.readAllLines(path);
      LOGGER.info("All parametrs read successfully");
      return parametrs;
    } catch (IOException e){
      LOGGER.error("Exception in ParametrsRead " + e.getMessage());
      throw new InvalidPathException("Path" + path + "is not valid",e);
    }
  }
}
