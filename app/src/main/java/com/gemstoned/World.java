package com.gemstoned;

import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.KeyEvent;
import android.media.SoundPool;
import android.media.AudioManager;
import android.graphics.Typeface;
import java.util.*;

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class GameGlobals
{
	/* On/Off switches */
	public static int TVModeFlag = 0; 
	public static int PlayFieldHeightIncrease = 0; //2;
	
	public static final int UNIQUE_ID_NONE = 0;
	public static final int GROUP_ID_NONE = 0;
	
	/* Add constants for group ids */
	public static final int GROUP_ID_MENU_A = 201;
	public static final int GROUP_ID_MENU_B = 202;
	public static final int GROUP_ID_MENU_C = 203;
	public static final int GROUP_ID_MENU_C2 = 204;
	public static final int GROUP_ID_MENU_D = 205;
	public static final int GROUP_ID_MENU_E = 206;
	public static final int GROUP_ID_MENU_F = 207;
	public static final int GROUP_ID_MENU_G = 208;
	public static final int GROUP_ID_MENU_H = 209;
	public static final int GROUP_ID_MENU_I = 210;
	
	/* Add constants for unique ids */	
	public static final int UNIQUE_ID_BUTTON_START = 101;
	public static final int UNIQUE_ID_BUTTON_CONTINUE = 99;
	public static final int UNIQUE_ID_BUTTON_OPTIONS = 102;
	public static final int UNIQUE_ID_BUTTON_HIGH_SCORES = 103;
	
	public static final int UNIQUE_ID_BUTTON_GAME_MODE_NORMAL = 104;
	public static final int UNIQUE_ID_BUTTON_GAME_MODE_INFINITE = 105;
	public static final int UNIQUE_ID_BUTTON_GAME_MODE_COUNTDOWN = 106;
	public static final int UNIQUE_ID_BUTTON_GAME_MODE_SPECIAL = 100;
	
	public static final int UNIQUE_ID_CAPTION_OPTION_GRID_HEIGHT = 107;
	public static final int UNIQUE_ID_CAPTION_OPTION_GEM_TYPE_COUNT = 108;	
	public static final int UNIQUE_ID_BUTTON_OPTION_INC_GRID_HEIGHT = 109;
	public static final int UNIQUE_ID_BUTTON_OPTION_DEC_GRID_HEIGHT = 110;
	public static final int UNIQUE_ID_BUTTON_OPTION_INC_GEM_TYPE_COUNT = 111;
	public static final int UNIQUE_ID_BUTTON_OPTION_DEC_GEM_TYPE_COUNT = 112;
	public static final int UNIQUE_ID_CHECKBOX_OPTION_SOUNDS = 113;

	public static final int UNIQUE_ID_MULTISTATE_BUTTON_OPTION_BACKGROUND_1 = 115;
	public static final int UNIQUE_ID_MULTISTATE_BUTTON_OPTION_GEM_STYLE_INDEX = 1150;
	public static final int UNIQUE_ID_TYPE_SWAP_CELL_DEMO_DISPLAY_1 = 1151;
	
	public static final int UNIQUE_ID_BUTTON_OPTION_OKAY = 116;	
	public static final int UNIQUE_ID_CAPTION_HIGH_SCORES_LIST = 117;
	public static final int UNIQUE_ID_BUTTON_HIGH_SCORES_OKAY = 118;
	public static final int UNIQUE_ID_BUTTON_HIGH_SCORES_LEFT = 119;
	public static final int UNIQUE_ID_BUTTON_HIGH_SCORES_RIGHT = 120;
    public static final int UNIQUE_ID_CAPTION_GAME_OVER_NAME = 121;
	public static final int UNIQUE_ID_BUTTON_GAME_OVER_LEFT = 122;
    public static final int UNIQUE_ID_BUTTON_GAME_OVER_DOWN = 123;
    public static final int UNIQUE_ID_BUTTON_GAME_OVER_UP = 124;
    public static final int UNIQUE_ID_BUTTON_GAME_OVER_RIGHT = 125;
    public static final int UNIQUE_ID_BUTTON_GAME_OVER_OKAY = 126;
    public static final int UNIQUE_ID_BUTTON_GAME_OVER_OKAY_ADD_SCORE = 127;
    
    public static final int UNIQUE_ID_CAPTION_MAIN_TITLE = 128;
    public static final int UNIQUE_ID_CAPTION_GENERAL = 129;
    
    public static final int UNIQUE_ID_BUTTON_ABOUT_OKAY = 153;
    public static final int UNIQUE_ID_BUTTON_ABOUT = 154;
    
    public static final int UNIQUE_ID_BUTTON_ABOUT_EULA = 155;
    public static final int UNIQUE_ID_BUTTON_ABOUT_EULA_OKAY = 156;
    public static final int UNIQUE_ID_BUTTON_ABOUT_EULA_UP = 157;
    public static final int UNIQUE_ID_BUTTON_ABOUT_EULA_DOWN = 158;    
    
    public static final int UNIQUE_ID_BUTTON_MENUI_O = 159;
    public static final int UNIQUE_ID_BUTTON_MENUI_X = 160;
    
    public static final int UNIQUE_ID_CAPTION_OPTION_GRID_WIDTH = 161;
	public static final int UNIQUE_ID_BUTTON_OPTION_INC_GRID_WIDTH = 162;
	public static final int UNIQUE_ID_BUTTON_OPTION_DEC_GRID_WIDTH = 163;    

	public static final int MAX_HIGH_SCORES = 10;
	public static final int MAX_HIGH_SCORE_NAME_LENGTH = 12;
	
	public static final int Y_SHIFT = -48;
		
	/* Graphics-related variables */
    
	/* Add global variables here */	
    //public static int GameSpeed;
    //public static int CellTypeCount; // PitCount;
    //public static int SoundsFlag;
    //public static int SpecialEffectsFlag; // GarbageBlocksFlag;
    //public static int BackGroundIndex;
/*       
    public static String[] HighScoresNames_GameModeA;
    public static int[] HighScoresValue_GameModeA;
    public static String[] HighScoresNames_GameModeB;
    public static int[] HighScoresValue_GameModeB;
    public static String[] HighScoresNames_GameModeC;
    public static int[] HighScoresValue_GameModeC;
    protected static int HighScoreBoardIndex;
    protected static final int HIGH_SCORE_BOARD_INDEX_MAX = 2;
*/
/*	
    public static String CurrentPlayerName;
    protected static int CurrentPlayerNameCursorPosition;
*/    
    //public static int CurrentPlayerScore;
    //public static int CurrentGameType;
    //public static int CurrentCellCount;
    //public static int MainFontColor = Color.rgb( 255, 255, 0 );   
    
    //protected static int i;
    
    public static SimpleBackGround BackDrop = null;
    
    /* for debugging purposes */
    public static Caption debugcaption;    
    
  
    // * * * * * * * * * * * * * * * 
    
    public static GameEngine GE;       
    
/*    
public static int CellLookIndex = 0;
public final static int MAX_CELL_LOOKS = 10;    
*/
    protected static Random rand = new Random();
    
//-------------------------------------------------------------------------------------
    public GameGlobals()
    {
    	int i;  	     
  
      //CurrentGameType = GAME_MODE_A;
      //GameSpeed = 5;
      //CellTypeCount = STANDARD_CELL_TYPE_COUNT; 
            
      //SoundsFlag = 0;
      //SpecialEffectsFlag = 1; 
      //BackGroundIndex = 0;
      	   
      debugcaption = new Caption(10, 20, "");
      debugcaption.SetLayers( GameEngine.CurrentObj.LAYER_3, GameEngine.CurrentObj.LAYER_2 );
      debugcaption.SetTextOptions( 10, Color.rgb(255,255,255), 0, 20, true, 20 );     
      
      //CurrentPlayerScore = 0;     
      //CurrentPlayerNameCursorPosition = 0;
     //CurrentCellCount = 0;

      int k = 2000;
     
      HighScores.Gemstoned_Init();
      HighScores.CurrentObj.LoadHighScores();
      GameOptions.Load();
    }
  //-------------------------------------------------------------------------------------
public static int random( int lower, int upper )
{
   return rand.nextInt(upper - lower + 1) + lower;
}
//--------------------------------------------------------------------------    
public static void ChangeBackGround()
{
  int Digit1 = 0;
  int Digit0 = 0;
	
  BackDrop.SetTileStyle( GameControl.BACKGROUND_330x490_0 + GameOptions.BackGroundIndex, Digit1, Digit0, 1, 1, 
	 SimpleBackGround.BACKGROUND_TILE_WIDTH_PIXELS, SimpleBackGround.BACKGROUND_TILE_HEIGHT_PIXELS, 255 );
}
//-------------------------------------------------------------------------------------    
public static void DrawTileImageOne( int ImageIndex, int X, int Y, int Z, int AlphaValue, int CellX, int CellY,
	    	int nCellWidthPixels, int nCellHeightPixels)
{
	      GE.DrawSubImage( ImageIndex, X, Y, Z, AlphaValue, CellX * (nCellWidthPixels + 1) + 1, 
	    		  CellY * (nCellHeightPixels + 1) + 1, nCellWidthPixels-1, nCellHeightPixels-1 );      
/*
 0123456789
0##########
1#  #  #  #
2#  #  #  #
3##########  
4#  #  #  #
5#  #  #  #
6########## 
7#  #  #  #
8#  #  #  #
9##########
 
(w + 1) * x + 1 
(h + 1) * y + 1
*/
}	    
//-------------------------------------------------------------------------------------
public static void DrawTileImageOne( int ImageIndex, int X, int Y, int Z, int AlphaValue, int CellX, int CellY,
	    	int nCellWidthPixels, int nCellHeightPixels, int nXScalePercent, int nYScalePercent )
{
	      GE.DrawSubImage( ImageIndex, X, Y, Z, AlphaValue, CellX * (nCellWidthPixels + 1) + 1, 
	    		  CellY * (nCellHeightPixels + 1) + 1, nCellWidthPixels-1, nCellHeightPixels-1,
	    		  nXScalePercent, nYScalePercent);  
}	    
//-------------------------------------------------------------------------------------  
public static void DrawTileImageGeneralUltra( int ImageIndex, int X, int Y, int Z, int AlphaValue, int CellX, int CellY,
	    		int Width_Cells, int Height_Cells, int TileWidthPixels, int TileHeightPixels )
{
	    	int TileWidthPixelsEnlarged = TileWidthPixels + 2;
	    	int TileHeightPixelsEnlarged = TileHeightPixels + 2; 	
	         
	        GE.DrawSubImage( ImageIndex, X, Y, Z, AlphaValue, CellX * (TileWidthPixelsEnlarged + 2) + 1, 
	      		  CellY * (TileHeightPixelsEnlarged + 2) + 1,
	      		  TileWidthPixels * Width_Cells, 
	      		  TileHeightPixels * Height_Cells );
} 
//------------------------------------------------------------------------------------- 	
public static String repeat(String str, int times)
{
   StringBuilder ret = new StringBuilder();
   for(int i = 0;i < times;i++) 
	   ret.append(str);
   return ret.toString();
}
//-------------------------------------------------------------------------------------
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class HighScores
{
public final static int LIST_LENGTH = 10;
public final static int MAX_NAME_LENGTH = 12;
public final static String FileName = "highscores.txt";

int[][] ScoreList;
String[][] NameList;
String[] ListTypeNames;

protected int ListTypeCount;
public int ListTypeIndex = 0;

public static HighScores CurrentObj = null;

//-------------------------------------------------------------------------------------
static public HighScores Gemstoned_Init()
{
   String[] typenames = { "Normal", "Infinite", "Countdown", "Special" };
   
   CurrentObj = new HighScores( 4, typenames );
   
   return CurrentObj;
}
//-------------------------------------------------------------------------------------
public HighScores( int nListTypeCount, String[] sListTypeNames )
{
  ListTypeCount = nListTypeCount;
  ScoreList = new int[LIST_LENGTH][ListTypeCount];
  NameList = new String[LIST_LENGTH][ListTypeCount];
  ListTypeNames = new String[ListTypeCount];

  String[] names = {"ALICE","BEATRICE","CONRAD","DENNIS","EDGAR","FRANCIE","HANK","HOLLY","JILL","KEITH"};

  int i, h;

  for( h = 0; h < ListTypeCount; h++ )
  {
   for( i = 0; i < LIST_LENGTH; i++ )
   {
     ScoreList[i][h] = (int)(LIST_LENGTH * 200 - i * 100);
     NameList[i][h] = AddSpacesLeft(names[i], MAX_NAME_LENGTH );
   }
   ListTypeNames[h] = new String(sListTypeNames[h]);
  }
}
//-------------------------------------------------------------------------------------
static public String AddSpacesLeft( String str, int minlength )
{
 String space_str = " ";
 int spaces_add = minlength - str.length();

 if( spaces_add >= 1 )
 {    
    str = str + GameGlobals.repeat(space_str, spaces_add);
 }

    return str;
}
//-------------------------------------------------------------------------------------
public int CheckNewHighScore( int nListTypeIndex, int Score )
{
  int i, returnvalue = 0;

  for( i = 0; i < LIST_LENGTH; i++ )
    if( Score > ScoreList[i][nListTypeIndex] )
    {
      returnvalue = 1;
      break;
    }

  return returnvalue;
}
//-------------------------------------------------------------------------------------
public static void Highest2Lowest( String[] sList, int[] List )
{
  int x, y, z;
  String str;
  
  for( y = 0; y < List.length; y++ )
   for( x = 0; x < List.length; x++ )
    if( List[x] < List[y] )
    {
       z = List[x];
       List[x] = List[y];
       List[y] = z;
       str = sList[x];
       sList[x] = sList[y];
       sList[y] = str;
    }
}    
//-------------------------------------------------------------------------------------
public void Add2HighScore( int nListType, String name, int Score )
{
  ScoreList[LIST_LENGTH - 1][nListType] = Score;
  NameList[LIST_LENGTH - 1][nListType] = name; 
  
  int[] ScoreListCopy = new int[LIST_LENGTH];
  String[] NameListCopy = new String[LIST_LENGTH];
  
  int i;
  
  for( i = 0; i < LIST_LENGTH; i++ )
  {
    ScoreListCopy[i] = ScoreList[i][nListType];
    NameListCopy[i] = NameList[i][nListType];
  }
  
  Highest2Lowest( NameListCopy, ScoreListCopy );
  
  for( i = 0; i < LIST_LENGTH; i++ )
  {
    ScoreList[i][nListType] = ScoreListCopy[i];
    NameList[i][nListType] = NameListCopy[i];
  }  
}
//-------------------------------------------------------------------------------------
public void SaveHighScores()
{
  GameEngine ge = GameEngine.CurrentObj;
  String str;
  ge.FileName = FileName;
  
  int i, h;
  
  str = ListTypeCount + ",";
  
  for( h = 0; h < ListTypeCount; h++ )
  {
	str += ListTypeNames[h] + ",";
	for( i = 0; i < LIST_LENGTH; i++ )
	  str += NameList[i][h] + "," + ScoreList[i][h] + ",";
  }	   
  
  ge.FileDataStr = str;
  ge.DoRequest(ge.G_REQUEST_WRITE_FILE);
/*
 * GE.FileName
	      String[] list;
	      
	      list = GE.FileDataStr.split(",");
GE.DoRequest(GE.G_REQUEST_WRITE_FILE);

   GE.FileOperationFlag = GE.G_REQUEST_READ_FILE;
   GameEngine.CurrentObj.DoRequest(GameEngine.CurrentObj.G_REQUEST_READ_FILE);
   
public final static int LIST_LENGTH = 10;
public final static int MAX_NAME_LENGTH = 12;

int[][] ScoreList;
String[][] NameList;
String[] ListTypeNames;

int ListTypeCount;	
 */
}
//-------------------------------------------------------------------------------------
public void LoadHighScores()
{
  GameEngine ge = GameEngine.CurrentObj;
    
  ge.FileName = FileName;
  ge.DoRequest(ge.G_REQUEST_READ_FILE);	
  String str = ge.FileDataStr;
  
  if( str == null )
	  return;
  
  if( str.length() < 1 )
	  return;
  
  int h, i, index = 0;
  String[] list = str.split(",");
  
  ListTypeCount = Integer.parseInt(list[index]);
  ScoreList = new int[LIST_LENGTH][ListTypeCount];
  NameList = new String[LIST_LENGTH][ListTypeCount];
  ListTypeNames = new String[ListTypeCount];
  
  index++;
  
  for( h = 0; h < ListTypeCount; h++ )
  {
	ListTypeNames[h] = list[index];
	index++;
	
	for( i = 0; i < LIST_LENGTH; i++ )
	{
	  NameList[i][h] = list[index];
	  index++;
      ScoreList[i][h] = Integer.parseInt(list[index]);
      index++;
	}
  }	     
}
//-------------------------------------------------------------------------------------
public void ChangeListTypeIndex( int IndexDirection )
{
   ListTypeIndex += IndexDirection;
   
   if( ListTypeIndex >= ListTypeCount )
	   ListTypeIndex = 0;
   if( ListTypeIndex < 0 )
	   ListTypeIndex = ListTypeCount - 1;
}
//-------------------------------------------------------------------------------------
public String CurrentList2String()
{
  int i;
  
  String str = ListTypeNames[ListTypeIndex] + "\n";
  
  for( i = 0; i < LIST_LENGTH; i++ )
	str += NameList[i][ListTypeIndex] + "  " + ScoreList[i][ListTypeIndex] + "\n";
    
  return str;
}
//-------------------------------------------------------------------------------------	
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class GameOptions
{

public final static int MIN_GEM_TYPE_COUNT = 6, MAX_GEM_TYPE_COUNT = 9;
public final static int MIN_GRID_WIDTH = 4, MAX_GRID_WIDTH = 8;
public final static int MIN_GRID_HEIGHT = 4, MAX_GRID_HEIGHT = 11;
public final static int MIN_GEM_STYLE_INDEX = 0, MAX_GEM_STYLE_INDEX = 9;
public final static int MIN_BACKGROUND_INDEX = 0, MAX_BACKGROUND_INDEX = 9;

public final static int GAME_NORMAL = 0, GAME_INFINITE = 1, GAME_COUNT_DOWN = 2, GAME_SPECIAL = 3;

public static int GemTypeCount = MIN_GEM_TYPE_COUNT; 
public static int GridHeight = 8;
public static int GridWidth = 8;
public static int GemStyleIndex = 7; 
public static int SoundsFlag = 1;
public static int BackGroundIndex = 0;
public static int CurrentGameType = GAME_NORMAL;

public static String CurrentPlayerName = "------------";
public static int CurrentPlayerNameCursorPosition = 0;
public static int CurrentPlayerScore = 0;
public static int MainFontColor = Color.rgb( 255, 255, 0 );
public static int MainFontShadowColor = Color.rgb( 20, 20, 20 );

public final static String FileName = "options.txt";

//-------------------------------------------------------------------------------------
public static void Save()
{
  GameEngine ge = GameEngine.CurrentObj;  
  ge.FileName = FileName;	
  ge.FileDataStr = GemTypeCount + "," + GridHeight + "," + GridWidth + "," + GemStyleIndex + "," + SoundsFlag + "," + BackGroundIndex + "," + CurrentGameType + ",";
  
  ge.DoRequest(ge.G_REQUEST_WRITE_FILE);
}
//-------------------------------------------------------------------------------------
public static void Load()
{

  GameEngine ge = GameEngine.CurrentObj; 
  ge.FileName = FileName;
  ge.DoRequest(ge.G_REQUEST_READ_FILE);	
 
  String str = ge.FileDataStr;  

  if( str.length() <= 1 )
	  return;

  String[] list = str.split(",");
 
  if( list.length < 7 )
	  return;	

  GemTypeCount = Integer.parseInt(list[0]);   
  GridHeight = Integer.parseInt(list[1]); 
  GridWidth = Integer.parseInt(list[2]);
  GemStyleIndex = Integer.parseInt(list[3]); 
  SoundsFlag = Integer.parseInt(list[4]);
  BackGroundIndex = Integer.parseInt(list[5]);
  CurrentGameType = Integer.parseInt(list[6]);
 
}
//-------------------------------------------------------------------------------------
static public void EditCurrentPlayerName( int ChangeCursorPosition, int ChangeCharacter )
{
  char[] NameChars = CurrentPlayerName.toCharArray();
		  
  if( ChangeCursorPosition < 0 )
	  CurrentPlayerNameCursorPosition--;
  else
  if( ChangeCursorPosition > 0 )
	  CurrentPlayerNameCursorPosition++;
  
  if( CurrentPlayerNameCursorPosition < 0 )
	  CurrentPlayerNameCursorPosition = 0;
  
  if( CurrentPlayerNameCursorPosition > HighScores.MAX_NAME_LENGTH  - 1 )
	  CurrentPlayerNameCursorPosition = HighScores.MAX_NAME_LENGTH  - 1;    

  if( ChangeCharacter < 0 )
	  NameChars[CurrentPlayerNameCursorPosition]--;
  else
  if( ChangeCharacter > 0 )
	  NameChars[CurrentPlayerNameCursorPosition]++;
 
  
  if( NameChars[CurrentPlayerNameCursorPosition] < 45 )
	  NameChars[CurrentPlayerNameCursorPosition] = 95;
  
  if( NameChars[CurrentPlayerNameCursorPosition] > 95 )
	  NameChars[CurrentPlayerNameCursorPosition] = 45;
  
  CurrentPlayerName = new String(NameChars); 
}
//-------------------------------------------------------------------------------------
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
abstract class GameObject
{
public float X, Y;
public int GridX, GridY;
public String Name;

public static int MouseX, MouseY, MouseStatus;
public static int KeyCode, KeyStatus;

public boolean MouseEventNotifyFlag, KeyEventNotifyFlag;

public static final int ME_NOTHING = -1;
public static final int ME_PRESS_DOWN = 0;
public static final int ME_RELEASE = 1; 
public static final int ME_MOVE = 2;  

public static final int ME_KEY_DOWN = 3;
public static final int ME_KEY_UP = 4;

public int MouseX_Dup, MouseY_Dup, MouseStatus_Dup;
public int KeyCode_Dup, KeyStatus_Dup;

public static final int ScreenWidth = 320;
public static final int ScreenHeight = 480;

protected static GameEngine GE;

protected int TextLayer;
protected int PictureLayer;

public int UniqueId;
public int GroupId;

public char[] ClassType;
public static final int MAX_CLASS_TYPES = 100;

/* input delay */

public int InputDelayMax;
public int InputDelayCounter;

/* Add extended class types here */
  
public static final char TYPE_BUTTON = 0;
public static final char TYPE_CAPTION = 1;
public static final char TYPE_CHECKBOX = 2;
public static final char TYPE_RADIO_BUTTON = 3;
public static final char TYPE_MULTI_STATE_BUTTON = 4;
public static final char TYPE_SIMPLE_BACKGROUND = 5;
public static final char TYPE_BLOCK_GAME_ENGINE = 6;
public static final char TYPE_MENU_CURSOR_PARALLELIA = 7;
public static final char TYPE_CAPTION_BOX = 8;
public static final char TYPE_BLOCKCELL = 9;
public static final char TYPE_WAVY_PILLARS = 10;
public static final char TYPE_PARABOLIC_PROJECTILE_CELLS = 11;
public static final char TYPE_SWAP_CELL = 12;
public static final char TYPE_SWAP_CELL_GRID = 13;
public static final char TYPE_CUSTOM_DRAW_TEXT = 14;
public static final char TYPE_COPYRIGHT_CAPTION = 15;
public static final char TYPE_SWAP_CELL_DEMO_DISPLAY = 16;
public static final char TYPE_SCORE_BAR = 17;
public static final char TYPE_SWAP_CELL_GRID_CONTROLLER = 18;

//-------------------------------------------------------------------------------------
public GameObject()
{
  X = Y = 0.0f; GridX = GridY = 0;
  Name = new String("");
  ClassType = new char[MAX_CLASS_TYPES];
  MouseEventNotifyFlag = KeyEventNotifyFlag = false;
  UniqueId = 0; GroupId = 0;
  PictureLayer = GE.LAYER_0; 
  TextLayer = GE.LAYER_1;
  ClearDupInput();
  
  InputDelayMax = 5;
  InputDelayCounter = 0;
}
//-------------------------------------------------------------------------------------
public static void SetGameEngine( GameEngine pGE )
{
  GE = pGE;
}
//-------------------------------------------------------------------------------------
public void SetLayers( int nTextLayer, int nPictureLayer )
{
  TextLayer = nTextLayer; PictureLayer = nPictureLayer;
}
//-------------------------------------------------------------------------------------
public void Draw() {}
public void Do() {}
public void OnClick() {}
public void OnKey() {}
//-------------------------------------------------------------------------------------
public void CopyDupInput()
{
  MouseX_Dup = MouseX;
  MouseY_Dup = MouseY;
  MouseStatus_Dup = MouseStatus;
  KeyCode_Dup = KeyCode;
  KeyStatus_Dup = ME_NOTHING;	
}
//-------------------------------------------------------------------------------------
public void ClearDupInput()
{
 MouseX_Dup = MouseY_Dup = MouseStatus_Dup =
   KeyCode_Dup = KeyStatus_Dup = ME_NOTHING;
}
//-------------------------------------------------------------------------------------
}

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class Button extends GameObject
{

public static final int BUTTON_RELEASED = 0;
public static final int BUTTON_PRESSED = 1;

public static final int STYLE_PRIMITIVE = 1;
public static final int STYLE_PICTURE = 2;

public static final int BUTTON_MECHANIC_NORMAL = 0;
public static final int BUTTON_MECHANIC_STICKY = 1;

protected int ButtonState;
protected int Width, Height;
protected int BorderColor0, InnerColor0, DrawStyle0, PictureIndex0, TextColor0;
protected int BorderColor1, InnerColor1, DrawStyle1, PictureIndex1, TextColor1;
protected int FontSize;
protected int ButtonMechanic;

protected int PictureIndex0_TileX, PictureIndex0_TileY;
protected int PictureIndex1_TileX, PictureIndex1_TileY;
protected int PictureWidthCells, PictureHeightCells;
protected int TileWidthPixels, TileHeightPixels;
protected int AlphaValue;

protected int DrawAltFlag = 0;

//-------------------------------------------------------------------------------------
public Button()
{
super();
ClassType[TYPE_BUTTON] = 1;
ButtonState = BUTTON_RELEASED;
MouseEventNotifyFlag = true;
PictureLayer = GE.LAYER_1;
TextLayer = GE.LAYER_2;
AlphaValue = 255;
}
//-------------------------------------------------------------------------------------
public Button( String Caption, int nX, int nY, int nWidth, int nHeight )
{
super();
ClassType[TYPE_BUTTON] = 1;
Name = new String(Caption);
X = nX; Y = nY; Width = nWidth; Height = nHeight;
ButtonState = BUTTON_RELEASED;
MouseEventNotifyFlag = true;

DrawStyle0 = STYLE_PRIMITIVE;
InnerColor0 = Color.rgb(100,100,100);
BorderColor0 = Color.rgb(255, 0, 0);
TextColor0 = Color.rgb(255, 0, 0);
PictureIndex0 = 0;

DrawStyle1 = STYLE_PRIMITIVE;
InnerColor1 = Color.rgb(100,100,100);
BorderColor1 = Color.rgb(255, 255, 255);
TextColor1 = Color.rgb(255, 255, 255);
PictureIndex1 = 0;

FontSize = 18;
ButtonMechanic = BUTTON_MECHANIC_NORMAL;
PictureLayer = GE.LAYER_1;
TextLayer = GE.LAYER_2;

PictureIndex0_TileX = PictureIndex0_TileY = -1;
PictureIndex1_TileX = PictureIndex1_TileY = -1;
PictureWidthCells = PictureHeightCells = -1;
AlphaValue = 255;
}
//-------------------------------------------------------------------------------------
public void SetReleasedStyle( int nDrawStyle, int nBorderColor, int nInnerColor, int nPictureIndex, 
         int nTextColor )
{
DrawStyle0 = nDrawStyle; BorderColor0 = nBorderColor; InnerColor0 = nInnerColor; 
PictureIndex0 = nPictureIndex; TextColor0 = nTextColor;
}
//------------------------------------------------------------------------------------- 
public void SetPressedStyle( int nDrawStyle, int nBorderColor, int nInnerColor, int nPictureIndex, 
         int nTextColor )
{
DrawStyle1 = nDrawStyle; BorderColor1 = nBorderColor; InnerColor1 = nInnerColor; 
PictureIndex1 = nPictureIndex; TextColor1 = nTextColor;
}
//------------------------------------------------------------------------------------- 
protected boolean CheckClickWithin()
{
boolean returnvalue = false;

if( X <= MouseX && MouseX < X + Width &&
    Y <= MouseY && MouseY < Y + Height )
    returnvalue = true;
return returnvalue;    
}
//-------------------------------------------------------------------------------------
protected void DrawPressed()
{
if( DrawStyle1 == STYLE_PRIMITIVE )
{
  GE.DrawBox( X, Y, X+Width, Y+Height, PictureLayer, BorderColor1, 
    GameEngine.G_STYLE_FILL );
  GE.DrawBox( X+2, Y+2, X+Width-2, Y+Height-2, PictureLayer, InnerColor1, 
    GameEngine.G_STYLE_FILL );
  GE.DrawTextColor( Name,(int)X+5, (int)Y+Height-10, TextLayer, TextColor1, FontSize );
}
else
if( DrawStyle1 == STYLE_PICTURE )
{
  if( PictureIndex1_TileX > -1 )
      GameGlobals.DrawTileImageGeneralUltra( PictureIndex1, (int)X, (int)Y, PictureLayer, AlphaValue, PictureIndex1_TileX, PictureIndex1_TileY, 
    	PictureWidthCells, PictureHeightCells, TileWidthPixels, TileHeightPixels );  
  else	
      GE.DrawImage( PictureIndex1, (int)X, (int)Y, PictureLayer );    
}
}
//-------------------------------------------------------------------------------------
protected void DrawReleased()
{
if( DrawStyle0 == STYLE_PRIMITIVE )
{
  GE.DrawBox( X, Y, X+Width, Y+Height, PictureLayer, BorderColor0, 
    GameEngine.G_STYLE_FILL );
  GE.DrawBox( X+2, Y+2, X+Width-2, Y+Height-2, PictureLayer, InnerColor0, 
    GameEngine.G_STYLE_FILL );
  GE.DrawTextColor( Name,(int)X+5, (int)Y+Height-10, TextLayer, TextColor0, FontSize );
}
else
if( DrawStyle0 == STYLE_PICTURE )
{
  if( PictureIndex0_TileX > -1 )
	  GameGlobals.DrawTileImageGeneralUltra( PictureIndex0, (int)X, (int)Y, PictureLayer, AlphaValue, PictureIndex0_TileX, PictureIndex0_TileY, 
	    PictureWidthCells, PictureHeightCells, TileWidthPixels, TileHeightPixels );  
  else
     GE.DrawImage( PictureIndex0, (int)X, (int)Y, PictureLayer );    
}
}
//-------------------------------------------------------------------------------------
public void Draw()
{  
	
if( DrawAltFlag == 1 )
{
if( ButtonState == BUTTON_RELEASED )
   DrawAlt(0); //DrawReleased();
else
if( ButtonState == BUTTON_PRESSED )
   DrawAlt(1); //DrawPressed();   
}
else
{
if( ButtonState == BUTTON_RELEASED )
   DrawReleased();
else
if( ButtonState == BUTTON_PRESSED )
   DrawPressed();   
}

}
//-------------------------------------------------------------------------------------
public void OnClick() 
{
	int YesFlag = 0;
	
	if( (MouseStatus == ME_PRESS_DOWN || MouseStatus == ME_MOVE ))
	{
     if(  CheckClickWithin() )
	 {
		if( InputDelayMax > 0 )
		{
		  if( InputDelayCounter >= InputDelayMax )
		  {
		    YesFlag = 1;
		    InputDelayCounter = 0;	
		  }
	  
		}	
		else
		  YesFlag = 1;
		
		if( YesFlag == 1 )
		{
		    ButtonState = BUTTON_PRESSED;
		    CopyDupInput();
		    OnClickDo();    
		}
	 }
     else
     {
    	ButtonState = BUTTON_RELEASED;
     }
     
	}
	else 
    if( MouseStatus == ME_RELEASE && ButtonMechanic != BUTTON_MECHANIC_STICKY )
    {  
       ButtonState = BUTTON_RELEASED;
       if( CheckClickWithin() )
           CopyDupInput();
       OnUnClickDo();    
    }
}
//-------------------------------------------------------------------------------------
protected void OnClickDo()
{
}
//-------------------------------------------------------------------------------------
protected void OnUnClickDo()
{
}
//-------------------------------------------------------------------------------------
public void SetMechanic( int Option )
{
  switch( Option )
  { 
    case BUTTON_MECHANIC_NORMAL:
    case BUTTON_MECHANIC_STICKY:
      ButtonMechanic = Option;
    default:
      break;
  }
}
//-------------------------------------------------------------------------------------
public void Do()
{
  if( InputDelayCounter < InputDelayMax )
      InputDelayCounter++;	
}
//-------------------------------------------------------------------------------------
public void SetTileStyle( int nPictureIndex0, int nPictureIndex1, int nPictureIndex0_TileX,
		 int nPictureIndex0_TileY,  int nPictureIndex1_TileX,  int nPictureIndex1_TileY,
		 int nPictureWidthCells, int nPictureHeightCells, int nTileWidthPixels,
		 int nTileHeightPixels, int nAlphaValue )
{
  DrawStyle0 = DrawStyle1 = STYLE_PICTURE;	 
  PictureIndex0 = nPictureIndex0;
  PictureIndex1 = nPictureIndex1;
  PictureIndex0_TileX = nPictureIndex0_TileX;
  PictureIndex0_TileY = nPictureIndex0_TileY;
  PictureIndex1_TileX = nPictureIndex1_TileX;
  PictureIndex1_TileY = nPictureIndex1_TileY;
  PictureWidthCells = nPictureWidthCells;
  PictureHeightCells = nPictureHeightCells;
  TileWidthPixels = nTileWidthPixels;
  TileHeightPixels = nTileHeightPixels;
  AlphaValue = nAlphaValue;
}
//-------------------------------------------------------------------------------------
public void Create_WidthxHeight( int nX, int nY, int nWidth, int nHeight, int nGroupId, int nUniqueId, int nPictureLayer, int nTextLayer, 
   int nPictureIndex, int nRowIndex0, int nRowIndex1, int nAlpha )
{
 Width = nWidth; Height = nHeight;

 X = nX; Y = nY; GroupId = nGroupId; UniqueId = nUniqueId;
 PictureLayer = nPictureLayer; TextLayer = nTextLayer;

int ScaledWidth = (int)(GameControl.ImageScaleRelative_320x480[nPictureIndex] * Width);
int ScaledHeight = (int)(GameControl.ImageScaleRelative_320x480[nPictureIndex] * Height);

SetTileStyle( nPictureIndex, nPictureIndex, 0, nRowIndex0, 0, nRowIndex1, 1, 1, ScaledWidth, ScaledHeight, nAlpha  );

DrawAltFlag = 1;
}
//--------------------------------------------------------------------------
public void DrawAlt( int nState )
{
  if( nState == 0 )
     GameGlobals.DrawTileImageOne( PictureIndex0, (int)X, (int)Y, PictureLayer, AlphaValue, 0, PictureIndex0_TileY, 
    	 TileWidthPixels, TileHeightPixels );
  else
  if( nState == 1 )
     GameGlobals.DrawTileImageOne( PictureIndex1, (int)X, (int)Y, PictureLayer, AlphaValue, 0, PictureIndex1_TileY, 
    	 TileWidthPixels, TileHeightPixels );
}
//--------------------------------------------------------------------------
public int GetButtonState()
{
   return ButtonState;
}
//--------------------------------------------------------------------------
}

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class SwapCell extends Button
{
	
public final static int MOVE_TYPE_ONE_WAY = 1;
public final static int MOVE_TYPE_ROUND_TRIP = 2;

public final static int STATUS_ALIVE = 0;
public final static int STATUS_DYING = 1;
public final static int STATUS_DEAD = 2;

public int MovingFlag = 0;
protected int MoveType = 0;
protected int MovingXDir = 0;
protected int MovingYDir = 0;

protected int MovingSpeed = 0;
protected int MoveIndex = 0;
protected int MaxMoveIndex = 0;
protected int MaxMoveDistance = 0;
protected int[] MoveArrayX;
protected int[] MoveArrayY;

protected int CellId = 0;

public final static int CELL_ID_0 = 0, CELL_ID_1 = 1, CELL_ID_2 = 2, CELL_ID_3 = 3, 
          CELL_ID_4 = 4, CELL_ID_5 = 5, CELL_ID_6 = 6, CELL_ID_7 = 7, CELL_ID_8 = 8, CELL_ID_9 = 9;

public final static int MIN_CELL_ID = 1, MAX_CELL_ID = 9;
public static int MaxCellIdSetting = 7;

public int StatusFlag = 0;

public int XScalePercent = 100, YScalePercent = 100;

public int SubCellId = SUB_CELL_ID_NORMAL;
public int SubCellAlpha = 230;
public int LifeCount = 0;
public static int SubCellPictureIndex = GameControl.IMAGE_TILES_OVERLAY;

public final static int MAX_LIVES = 9;
public final static int SUB_CELL_ID_NORMAL = 0;
public final static int SUB_CELL_ID_LOCKED = 1;
public final static int SUB_CELL_ID_GARBAGE = 2;
public final static int SUB_CELL_ID_LIVES = 3;

public final static int SUB_CELL_CHANCE = 6;

public int RemoveLifeFlag = 0;

//-------------------------------------------------------------------------------------
public SwapCell( String Caption, int nX, int nY, int nWidth, int nHeight )
{
super();
ClassType[TYPE_SWAP_CELL] = 1;
Name = new String(Caption);
X = nX; Y = nY; Width = nWidth; Height = nHeight;
ButtonState = BUTTON_RELEASED;
MouseEventNotifyFlag = true;

ButtonMechanic = BUTTON_MECHANIC_NORMAL;
PictureLayer = GE.LAYER_1;
TextLayer = GE.LAYER_2;

AlphaValue = 255;
InputDelayMax = 5;
}
//-------------------------------------------------------------------------------------
public void Init( int nGridX, int nGridY )
{
//*** must be called after Create_WidthxHeight() ***
	
 MovingSpeed = TileWidthPixels/20;
 MoveIndex = 0; MaxMoveIndex = 0; MaxMoveDistance = TileWidthPixels;
 MoveArrayX = new int[TileWidthPixels]; MoveArrayY = new int[TileHeightPixels];
 GridX = nGridX; GridY = nGridY;
}
//-------------------------------------------------------------------------------------
public void SetId( int nCellId )
{
  CellId = nCellId;
  
  PictureIndex0_TileX = GameOptions.GemStyleIndex;
  PictureIndex0_TileY = nCellId;
  PictureIndex1_TileX = GameOptions.GemStyleIndex;
  PictureIndex1_TileY = nCellId;	
}
//-------------------------------------------------------------------------------------
public void SetIdRandomExcept( int ExceptCellId )
{
   int[] cell_id_list = new int[MAX_CELL_ID-MIN_CELL_ID];
   int i, n;
   
   n = 0;
   
   for( i = MIN_CELL_ID; i <= MaxCellIdSetting; i++ )
   {
	 if( i != ExceptCellId )
	 {
	   cell_id_list[n] = i;
       n++;			 
	 }
   }
   
   SetId( cell_id_list[SwapCellGrid.random( 0, MaxCellIdSetting-MIN_CELL_ID-1 )] );
}
//-------------------------------------------------------------------------------------
public void StartMove( int movetype, int xdir, int ydir, int nMovingSpeedMultiplier )
{
  if( StatusFlag >= STATUS_DYING )
	  return;
  
  int i;
  
  if( MovingFlag == 0 )
  {
    MovingXDir = (int)(Math.signum(xdir));
    MovingYDir = (int)(Math.signum(ydir));
    MoveType = movetype;
    MovingFlag = 1;    
    MoveIndex = 0;

    if( MoveType == MOVE_TYPE_ONE_WAY )
    {
       MaxMoveIndex = (MaxMoveDistance/(MovingSpeed * nMovingSpeedMultiplier));    
       for( i = 0; i < MaxMoveIndex; i++ )
       {
         MoveArrayX[i] = MovingSpeed * MovingXDir * nMovingSpeedMultiplier;
         MoveArrayY[i] = MovingSpeed * MovingYDir * nMovingSpeedMultiplier;
       }
    }
    else
    if( MoveType == MOVE_TYPE_ROUND_TRIP )
    {
       int HalfMoveIndex = (MaxMoveDistance/(MovingSpeed * nMovingSpeedMultiplier));      
       MaxMoveIndex = HalfMoveIndex * 2;

       for( i = 0; i < HalfMoveIndex; i++ )
       {
         MoveArrayX[i] = MovingSpeed * MovingXDir * nMovingSpeedMultiplier;
         MoveArrayY[i] = MovingSpeed * MovingYDir * nMovingSpeedMultiplier;
       }
       for( ; i < MaxMoveIndex; i++ )
       {
         MoveArrayX[i] = -1 * MovingSpeed * MovingXDir * nMovingSpeedMultiplier;
         MoveArrayY[i] = -1 * MovingSpeed * MovingYDir * nMovingSpeedMultiplier;
       }
    }
  }
}
//-------------------------------------------------------------------------------------
protected void Move()
{
  if( StatusFlag >= STATUS_DYING )
	  return;
  
  if( MovingFlag == 1 )
  {
   if( MoveIndex < MaxMoveIndex )
   {
     X = X + MoveArrayX[MoveIndex];
     Y = Y + MoveArrayY[MoveIndex];
     MoveIndex++;
   }
   else
   {
     MovingFlag = 0;
   }
  }
}
//-------------------------------------------------------------------------------------
public void Do()
{
 if( StatusFlag == STATUS_ALIVE )	 	
     Move();
  
  if( InputDelayCounter < InputDelayMax )
      InputDelayCounter++;	
  
  if( StatusFlag == STATUS_DYING )
  {
	 AlphaValue = AlphaValue - 50;
	 if( AlphaValue <= 0 )
	 {
		AlphaValue = 0;
		StatusFlag = STATUS_DEAD;
	 }
  }

if( SubCellId == SUB_CELL_ID_LIVES && StatusFlag != STATUS_DYING && StatusFlag != STATUS_DEAD )
{
  if( RemoveLifeFlag >= 1  )
  {
	  LifeCount--;	  
	  RemoveLifeFlag = 0;
  }
  
  if( LifeCount <= 0 )
  {	  
	 StatusFlag = STATUS_DYING;  	 
	 LifeCount = 0;
  }
}

}
//-------------------------------------------------------------------------------------
protected void OnClickDo()
{
}
//-------------------------------------------------------------------------------------
public void DrawAlt( int nState )
{
  if( nState == 0 )
     GameGlobals.DrawTileImageOne( PictureIndex0, (int)X, (int)Y, PictureLayer, AlphaValue, PictureIndex0_TileX, PictureIndex0_TileY, 
    	 TileWidthPixels, TileHeightPixels, XScalePercent, YScalePercent );
  else
  if( nState == 1 )
     GameGlobals.DrawTileImageOne( PictureIndex1, (int)X, (int)Y, PictureLayer, AlphaValue, PictureIndex1_TileX, PictureIndex1_TileY, 
    	 TileWidthPixels, TileHeightPixels, XScalePercent, YScalePercent );
  
//*** draw overlay ***
if( SubCellId != SUB_CELL_ID_NORMAL )
{
  int RowIndex;

  if( SubCellId == SUB_CELL_ID_LIVES )
    RowIndex = SubCellId + LifeCount;
  else
    RowIndex = SubCellId;

  GameGlobals.DrawTileImageOne( SubCellPictureIndex, (int)X, (int)Y, PictureLayer, SubCellAlpha, 0, RowIndex, 
    TileWidthPixels, TileHeightPixels, XScalePercent, YScalePercent );
}  
}
//--------------------------------------------------------------------------
public void SetRandomSubId()
{   
   if( SwapCellGrid.random( 0, SUB_CELL_CHANCE ) == SUB_CELL_CHANCE )
   {
     SubCellId = SwapCellGrid.random( SUB_CELL_ID_LOCKED, SUB_CELL_ID_LIVES );
     
     if( SubCellId == SUB_CELL_ID_GARBAGE )
      	 SubCellId = SwapCellGrid.random( SUB_CELL_ID_LOCKED, SUB_CELL_ID_LIVES );

     if( SubCellId == SUB_CELL_ID_LIVES )
         LifeCount = SwapCellGrid.random( 0, MAX_LIVES );
   }
}
//--------------------------------------------------------------------------
public int CheckMoveable()
{
  if( SubCellId == SUB_CELL_ID_LOCKED || SubCellId == SUB_CELL_ID_GARBAGE )
  {
   if( StatusFlag == STATUS_DYING || StatusFlag == STATUS_DEAD )
     return 0;
  }   
  else
     return 1;
  return 0;
}
//--------------------------------------------------------------------------
public String GetString()
{
   StringBuilder ret = new StringBuilder();

   ret.append(CellId + ",");
   ret.append(GridX + ",");
   ret.append(GridY + ",");
   ret.append(Width + ",");
   ret.append(Height + ",");
   ret.append(StatusFlag + ",");
   ret.append(SubCellId + ",");
   ret.append(LifeCount + "");
   
   return ret.toString();
}
//--------------------------------------------------------------------------
public int ExtractString( String str )
{
   String[] List = str.split(",");
		   
   if( List.length < 8 )
	   return 0;
  
   CellId = Integer.parseInt(List[0]);
   GridX = Integer.parseInt(List[1]);
   GridY = Integer.parseInt(List[2]);
   //GameGlobals.debugcaption.SetText( GridX + "," + GridY + ";" +   Integer.parseInt(List[1]) + "," +  Integer.parseInt(List[2])); 
   Width = Integer.parseInt(List[3]);
   Height = Integer.parseInt(List[4]);
   StatusFlag = Integer.parseInt(List[5]);
   SubCellId = Integer.parseInt(List[6]);
   LifeCount = Integer.parseInt(List[7]);
   
   SetId( CellId );
  
   return 1; 
}
//--------------------------------------------------------------------------
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class SwapCellGrid extends GameObject
{
public static int MAIN_GRID_WIDTH_CELLS = 8; 
public static int MAIN_GRID_HEIGHT_CELLS = 8;
public final static int TILE_WIDTH_PIXELS = 40;
public final static int TILE_HEIGHT_PIXELS = 40;

protected static SwapCell[][] MainGrid; // = new SwapCell[MAIN_GRID_WIDTH_CELLS][MAIN_GRID_HEIGHT_CELLS * 2];
public static Random rand = new Random();

public final static int HISTORY_SIZE = 2;
protected static SwapCell[] History = new SwapCell[HISTORY_SIZE];
protected static int SwappingFlag = 0;
protected static int SwappingSuccessFlag = 0;

public final static int SHIFT_DOWN_LIST_SIZE = 64 * 3;
protected static SwapCell[] ShiftDownList = new SwapCell[SHIFT_DOWN_LIST_SIZE];
protected static int ShiftCellsDownFlag = 0;

public final static int CHECK_CHAINS_POSSIBLE = 0;
public final static int CHECK_AND_REMOVE_CHAINS = 1;
public final static int BREAK_CHAINS = 2;

public final static String FileName = "swapcellgrid.txt";

public ScoreBar ItsScoreBar;

//protected String debugtext = "(no info to display)";

public int FadeOutAllFlag = 0;
public int FadeOutAllCounter = 255;
public int FadeOutAllSpeed = 10;
public int FadeOutAllMinAlpha = 0;
public int FadeOutStatus = FADE_OUT_STATUS_NOTHING;
public final static int FADE_OUT_STATUS_NOTHING = 0;
public final static int FADE_OUT_STATUS_WORKING = 1;
public final static int FADE_OUT_STATUS_DONE = 2;

public int NoMoreMovesFlag = 0;
public int ChainCount = 0;
public final static int FALLING_HOLD_COUNTER_MAX = 5;
public int FallingHoldCounter = FALLING_HOLD_COUNTER_MAX;

//--------------------------------------------------------------------------
public SwapCellGrid()
{
  super();
  ClassType[TYPE_SWAP_CELL_GRID] = 1;
  MouseEventNotifyFlag = true;
  SwappingFlag = 0;
   
  SwapCell.MaxCellIdSetting = GameOptions.GemTypeCount;
  MAIN_GRID_HEIGHT_CELLS = GameOptions.GridHeight;  
  MAIN_GRID_WIDTH_CELLS = GameOptions.GridWidth;
  ShiftCellsDownFlag = SwappingFlag = SwappingSuccessFlag = 0;
  
  ItsScoreBar = new ScoreBar();
  ItsScoreBar.Init();
}
//--------------------------------------------------------------------------
public static int random( int lower, int upper )
{
   return rand.nextInt(upper - lower + 1) + lower;
}
//--------------------------------------------------------------------------
protected SwapCell CreateRandomSwapCell( int x, int y, int xpos, int ypos )
{	
      SwapCell SwapCell_Obj = new SwapCell("SC", 0,0,0,0 );
      SwapCell_Obj.Create_WidthxHeight( xpos, ypos, TILE_WIDTH_PIXELS, TILE_HEIGHT_PIXELS, 
      GameGlobals.GROUP_ID_NONE, GameGlobals.UNIQUE_ID_NONE, GE.LAYER_2, GE.LAYER_1, GameControl.IMAGE_GEM_TILES_0, 0, 0, 255 );	

      SwapCell_Obj.Init( x, y );
      SwapCell_Obj.SetId( random( SwapCell.MIN_CELL_ID, SwapCell.MaxCellIdSetting ) );
    
      if( GameOptions.CurrentGameType == GameOptions.GAME_SPECIAL )
          SwapCell_Obj.SetRandomSubId();
     
      MainGrid[x][y] = SwapCell_Obj;
      
      return SwapCell_Obj;
}
//--------------------------------------------------------------------------
public void Init()
{
  int x, y, xpos, ypos, i;
  
  MainGrid = new SwapCell[MAIN_GRID_WIDTH_CELLS][MAIN_GRID_HEIGHT_CELLS * 2];

  X = 0; Y = -1 * MAIN_GRID_HEIGHT_CELLS * TILE_HEIGHT_PIXELS;

for( i = 1; i < 20; i++ )
{
  for( y = 0; y < MAIN_GRID_HEIGHT_CELLS * 2; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ )
   {
      xpos = (int)X + x * TILE_WIDTH_PIXELS;
      ypos = (int)Y + y * TILE_HEIGHT_PIXELS;

      MainGrid[x][y] = CreateRandomSwapCell( x, y, xpos, ypos );
   }
  
  CheckFormChain(BREAK_CHAINS);  

  if( CheckMovesFormChainPossible() >= 1 )
	  break;
}

}
//--------------------------------------------------------------------------
protected void RefillCells()
{	
  int x, y, xpos, ypos;

  X = 0; Y = -1 * MAIN_GRID_HEIGHT_CELLS * TILE_HEIGHT_PIXELS;

  for( y = 0; y < MAIN_GRID_HEIGHT_CELLS; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ )
    if( MainGrid[x][y] == null )   
    {
      xpos = (int)X + x * TILE_WIDTH_PIXELS;
      ypos = (int)Y + y * TILE_HEIGHT_PIXELS;

      MainGrid[x][y] = CreateRandomSwapCell( x, y, xpos, ypos );
    }	
}
//--------------------------------------------------------------------------
public void Draw()
{
  int x, y;

  for( y = MAIN_GRID_HEIGHT_CELLS - 1; y < MAIN_GRID_HEIGHT_CELLS * 2; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ )
	if( MainGrid[x][y] != null )   
     MainGrid[x][y].Draw();
  
  ItsScoreBar.Draw();
  //GE.DrawTextColor( debugtext, 5, 480-32, TextLayer, Color.GREEN, 12 );
}
//--------------------------------------------------------------------------
public void Do()
{

   FadeOut(1);   
  
   if( FadeOutStatus != FADE_OUT_STATUS_NOTHING )
	   return;
   
  int x, y, celldeathcount = 0;

  for( y = 0; y < MAIN_GRID_HEIGHT_CELLS * 2; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ )
	if( MainGrid[x][y] != null )
	{	
      MainGrid[x][y].Do();	
/*      
      if( MainGrid[x][y].AlphaValue <= 0 )
    	  debugtext = "Invisible cell at " + x + ", " + (y - MAIN_GRID_HEIGHT_CELLS);
*/      
     if( SwappingFlag != 1 )
     {	 
      if( MainGrid[x][y].StatusFlag == SwapCell.STATUS_DEAD )
      {
    	 MainGrid[x][y] = null;
    	 celldeathcount++;
      }
     }
	} 
   
  if( SwappingFlag == 1 )
    if( History[0].MovingFlag == 0 && History[1].MovingFlag == 0 )
    {                  
       if( SwappingSuccessFlag >= 1 )
       {   
           UpdateSwappedCellPositions();
           StartShiftCellsDownAlt();
        }
  
       History[0] = History[1] = null;
       	  
	  SwappingFlag = 0;
	  SwappingSuccessFlag = 0;
	 
	 if( ShiftCellsDownFlag <= 0 )
      if( CheckFormChain(CHECK_AND_REMOVE_CHAINS) >= 1 )
	      RefillCells();
    }
  	
  if( celldeathcount >= 1 )
	  StartShiftCellsDownAlt();
	  
  if( ShiftCellsDownFlag >= 1 )
	  DoShiftCellsDown();  
  
  ItsScoreBar.Do();
  
  if( FallingHoldCounter > 0 )
	  FallingHoldCounter--;
}
//--------------------------------------------------------------------------
protected void UpdateSwappedCellPositions()
{
   int i, gridx, gridy;
   
   gridx = History[0].GridX; gridy = History[0].GridY;
   History[0].GridX = History[1].GridX; History[0].GridY = History[1].GridY;
   History[1].GridX = gridx; History[1].GridY = gridy;
   
   MainGrid[History[0].GridX][History[0].GridY] = History[0];
   MainGrid[History[1].GridX][History[1].GridY] = History[1];   
}
//--------------------------------------------------------------------------
protected void Add2History( SwapCell SwapCell_Obj )
{
  int i;
  
  //*** don't add unmoveable objects ***
  if( SwapCell_Obj.CheckMoveable() == 0 )
	  return;
  
  //*** don't add the same object to list again ***
  for( i = 0; i < HISTORY_SIZE; i++ )
   if( History[i] != null )
    if( SwapCell_Obj.equals(History[i]))
        return;
  
  for( i = 0; i < HISTORY_SIZE; i++ )
   if( History[i] == null )
   {
     History[i] = SwapCell_Obj;
     break;
   }
}
//--------------------------------------------------------------------------
protected void TrySwap()
{  
  if( History[0] != null && History[1] != null )
  {
	int sum = Math.abs(History[0].GridX - History[1].GridX) + Math.abs(History[0].GridY - History[1].GridY);
	
	if( sum == 1 )
	{
	   int xdir0 = History[1].GridX - History[0].GridX;
	   int ydir0 = History[1].GridY - History[0].GridY;
	   int xdir1 = History[0].GridX - History[1].GridX;
	   int ydir1 = History[0].GridY - History[1].GridY;	 
	   
	   if( CheckSwappable() >= 1 )
	   {
	     History[0].StartMove( SwapCell.MOVE_TYPE_ONE_WAY, xdir0, ydir0, 4 );
	     History[1].StartMove( SwapCell.MOVE_TYPE_ONE_WAY, xdir1, ydir1, 4 );
	     SwappingSuccessFlag = 1;
	   }
	   else
	   {
	     History[0].StartMove( SwapCell.MOVE_TYPE_ROUND_TRIP, xdir0, ydir0, 4 );
	     History[1].StartMove( SwapCell.MOVE_TYPE_ROUND_TRIP, xdir1, ydir1, 4 );
	     SwappingSuccessFlag = 0;
	   }
	   
	   SwappingFlag = 1;
	}
	else
	{	   
	   History[0] = History[1] = null;
	   SwappingFlag = 0;
	}
  }
}
//--------------------------------------------------------------------------
public void OnClick()
{
  if( SwappingFlag >= 1 || ShiftCellsDownFlag >= 1 || FallingHoldCounter > 0 )
	  return;
  
  int x, y, ButtonPressedFlag = 0;

  for( y = MAIN_GRID_HEIGHT_CELLS; y < MAIN_GRID_HEIGHT_CELLS * 2; y++ )
  {
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ )
	if( MainGrid[x][y] != null )  
	 if( MainGrid[x][y].StatusFlag == SwapCell.STATUS_ALIVE )
    {
      MainGrid[x][y].OnClick();

      if( MainGrid[x][y].GetButtonState() == Button.BUTTON_PRESSED )
      {
         Add2History( MainGrid[x][y] );
         TrySwap();    	 
         //ButtonPressedFlag = 1;
         break;
      }
    }
/*   
   if( ButtonPressedFlag == 1 )
	   break;
*/	   
  }
}
//--------------------------------------------------------------------------
public void StartShiftCellsDown()
{
	int x, y, i, shiftdowncount = 0;
	int speedmultiplier = 1;

if( ShiftCellsDownFlag == 0 )
{  
  FallingHoldCounter = FALLING_HOLD_COUNTER_MAX;
  
  for( y = 0; y < MAIN_GRID_HEIGHT_CELLS * 2 - 1; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ )
	if( MainGrid[x][y] != null )
	 if( MainGrid[x][y].StatusFlag == SwapCell.STATUS_ALIVE )	
    {	
	   if( MainGrid[x][y + 1] == null )		   
	   {
		   if( y < MAIN_GRID_HEIGHT_CELLS - 1 )
			 speedmultiplier = 20;
		   else	
			 speedmultiplier = 5;
			   
		   MainGrid[x][y].StartMove( SwapCell.MOVE_TYPE_ONE_WAY, 0, 1, speedmultiplier );
		   shiftdowncount++;
		   
		   for( i = 0; i < SHIFT_DOWN_LIST_SIZE; i++ )
		    if( ShiftDownList[i] == null )
		    {
		    	ShiftDownList[i] = MainGrid[x][y];		    
		    	break;
		    }
	   }
    }

  if( shiftdowncount >= 1 )
	  ShiftCellsDownFlag = 1;    
  else
  if( CheckFormChain(CHECK_AND_REMOVE_CHAINS) >= 1 )
	  RefillCells();
}
}
//--------------------------------------------------------------------------
public void StartShiftCellsDownAlt()
{
	int x, y, y2, i, shiftdowncount = 0;
	int speedmultiplier = 5;
    int shiftdownlistindex = 0;
    
if( ShiftCellsDownFlag == 0 )
{      
  FallingHoldCounter = FALLING_HOLD_COUNTER_MAX;
  
  for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ )
   for( y = MAIN_GRID_HEIGHT_CELLS * 2 - 1; y >= 1; y-- )
	if( MainGrid[x][y] == null && MainGrid[x][y-1] != null )      
    {	
	   for( y2 = y-1; y2 >= 0; y2-- )		
	   if( MainGrid[x][y2] != null )	 
		if( MainGrid[x][y2].StatusFlag == SwapCell.STATUS_ALIVE )
	   {
		 MainGrid[x][y2].StartMove( SwapCell.MOVE_TYPE_ONE_WAY, 0, 1, speedmultiplier );
         ShiftDownList[shiftdownlistindex] = MainGrid[x][y2];
         shiftdownlistindex++;
		 shiftdowncount++;		   
	   }	   		   	 
	   break;
    }

  if( shiftdowncount >= 1 )
	  ShiftCellsDownFlag = 1;   
  else	  
  if( CheckFormChain(CHECK_AND_REMOVE_CHAINS) >= 1 )  
	  RefillCells();  
}	
}
//--------------------------------------------------------------------------
public void DoShiftCellsDown()
{
   int i, movingcount = 0;

if( ShiftCellsDownFlag == 1 )
{
  for( i = 0; i < SHIFT_DOWN_LIST_SIZE; i++ )
	if( ShiftDownList[i] != null )
	{
       if( ShiftDownList[i].MovingFlag >= 1 )		    
		   movingcount++;    
       else
       {   
    	   MainGrid[ShiftDownList[i].GridX][ShiftDownList[i].GridY+1] = ShiftDownList[i];
    	   MainGrid[ShiftDownList[i].GridX][ShiftDownList[i].GridY] = null;
    	   ShiftDownList[i].GridY++;
    	   ShiftDownList[i] = null;    	      		       		   
       }
	}
  
  if( movingcount <= 0 )
  {
    ShiftCellsDownFlag = 0;
    StartShiftCellsDownAlt();
    
    if( ShiftCellsDownFlag == 0 )
    {
      if( GameOptions.SoundsFlag >= 1 )
      {
        GE.SoundPlayIndex = 1;
        GE.DoRequest(GE.G_REQUEST_PLAY_SOUND);
      }
      
      if( CheckMovesFormChainPossible() == 0 )
       {
    	 if( GameOptions.CurrentGameType == GameOptions.GAME_NORMAL )
    	     NoMoreMovesFlag = 1;
    	 else
    	     PokeHoles();
       }
      
      RefillCells();
    }
  }    
}

}
//--------------------------------------------------------------------------
protected int CheckSwappable()
{
   int gridx_1, gridy_1, gridx_2, gridy_2;
   int chaincount_1, chaincount_2;
   
   //chaincount_1 = CheckFormChain(CHECK_CHAINS_POSSIBLE);
   
   if( History[0].CheckMoveable() == 0 || History[1].CheckMoveable() == 0 )
	   return 0;
   
   gridx_1 = History[0].GridX; gridy_1 = History[0].GridY;
   gridx_2 = History[1].GridX; gridy_2 = History[1].GridY;
   
   MainGrid[gridx_2][gridy_2] = History[0];
   History[0].GridX = gridx_2; History[0].GridY = gridy_2;
   
   MainGrid[gridx_1][gridy_1] = History[1];
   History[1].GridX = gridx_1; History[1].GridY = gridy_1;

   chaincount_2 = CheckFormChain(CHECK_CHAINS_POSSIBLE);

   MainGrid[gridx_1][gridy_1] = History[0];
   History[0].GridX = gridx_1; History[0].GridY = gridy_1;
   
   MainGrid[gridx_2][gridy_2] = History[1];
   History[1].GridX = gridx_2; History[1].GridY = gridy_2;
   
   //debugtext = "chaincount: " + (chaincount_2 - chaincount_1);
   
   //if( chaincount_2 > chaincount_1 )
   if( chaincount_2 > 0 )
	   return 1;
   else
	   return 0;
}
//--------------------------------------------------------------------------
protected int CheckFormChain( int mode )
{
int x, y, chaincount = 0;
SwapCell[] List = new SwapCell[3];

if( mode == CHECK_CHAINS_POSSIBLE )
{
//*** just check ***		

  // vertical
  for( y = MAIN_GRID_HEIGHT_CELLS; y < MAIN_GRID_HEIGHT_CELLS * 2 - 2; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ )  
   {
/*	   
	 if( MainGrid[x][y] == null || MainGrid[x][y+1] == null || MainGrid[x][y+2] == null )
		 continue;
	 
	 if( MainGrid[x][y].CellId == MainGrid[x][y+1].CellId && MainGrid[x][y+1].CellId == MainGrid[x][y+2].CellId )
		 chaincount++;
*/	  
	 List[0] = MainGrid[x][y]; List[1] = MainGrid[x][y+1]; List[2] = MainGrid[x][y+2];
	 if( CheckSwapCellMatch( List, CHECK_CHAINS_POSSIBLE ) >= 1 )
		 chaincount++;
   }
  // horizontal
  for( y = MAIN_GRID_HEIGHT_CELLS; y < MAIN_GRID_HEIGHT_CELLS * 2; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS - 2; x++ )  
   {
/*	   
	 if( MainGrid[x][y] == null || MainGrid[x+1][y] == null || MainGrid[x+2][y] == null )
		 continue;
	 
	 if( MainGrid[x][y].CellId == MainGrid[x+1][y].CellId && MainGrid[x+1][y].CellId == MainGrid[x+2][y].CellId )
		 chaincount++;
*/
	 List[0] = MainGrid[x][y]; List[1] = MainGrid[x+1][y]; List[2] = MainGrid[x+2][y];
	 if( CheckSwapCellMatch( List, CHECK_CHAINS_POSSIBLE ) >= 1 )
		 chaincount++;	   
   }  
}
else
if( mode == CHECK_AND_REMOVE_CHAINS )
{
//*** check and remove ***
	
  // vertical
  for( y = MAIN_GRID_HEIGHT_CELLS; y < MAIN_GRID_HEIGHT_CELLS * 2 - 2; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ )
   {
/*	   
	 if( MainGrid[x][y] == null || MainGrid[x][y+1] == null || MainGrid[x][y+2] == null )
		 continue;
	 
	 if( MainGrid[x][y].CellId == MainGrid[x][y+1].CellId && MainGrid[x][y+1].CellId == MainGrid[x][y+2].CellId )
	 {
		 MainGrid[x][y].StatusFlag = MainGrid[x][y+1].StatusFlag = MainGrid[x][y+2].StatusFlag = SwapCell.STATUS_DYING;
		 chaincount++;
	 }
*/	 
	 List[0] = MainGrid[x][y]; List[1] = MainGrid[x][y+1]; List[2] = MainGrid[x][y+2];
	 if( CheckSwapCellMatch( List, CHECK_AND_REMOVE_CHAINS ) >= 1 )
		 chaincount++;	   
   }
  // horizontal
  for( y = MAIN_GRID_HEIGHT_CELLS; y < MAIN_GRID_HEIGHT_CELLS * 2; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS - 2; x++ )
   {
/*	   
	 if( MainGrid[x][y] == null || MainGrid[x+1][y] == null || MainGrid[x+2][y] == null )
		 continue;
	 
	 if( MainGrid[x][y].CellId == MainGrid[x+1][y].CellId && MainGrid[x+1][y].CellId == MainGrid[x+2][y].CellId )
	 {
		 MainGrid[x][y].StatusFlag = MainGrid[x+1][y].StatusFlag = MainGrid[x+2][y].StatusFlag = SwapCell.STATUS_DYING;
		 chaincount++;
	 }
*/
	 List[0] = MainGrid[x][y]; List[1] = MainGrid[x+1][y]; List[2] = MainGrid[x+2][y];
	 if( CheckSwapCellMatch( List, CHECK_AND_REMOVE_CHAINS ) >= 1 )
		 chaincount++;		   
   }  	
  
   ChainCount += chaincount;
   
   if( GameOptions.SoundsFlag >= 1 && chaincount >= 1)
   {
      GE.SoundPlayIndex = 2;
      GE.DoRequest(GE.G_REQUEST_PLAY_SOUND);
   }   
}
else
if( mode == BREAK_CHAINS )
{
  int num;
  
//*** break chains ***
  // vertical
  for( y = MAIN_GRID_HEIGHT_CELLS; y < MAIN_GRID_HEIGHT_CELLS * 2 - 2; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ )
   {
/*	   
	 if( MainGrid[x][y] == null || MainGrid[x][y+1] == null || MainGrid[x][y+2] == null )
		 continue;
	 
	 if( MainGrid[x][y].CellId == MainGrid[x][y+1].CellId && MainGrid[x][y+1].CellId == MainGrid[x][y+2].CellId )
	 {
		 num = random(0,2);
		 MainGrid[x][y+num].SetIdRandomExcept( MainGrid[x][y+num].CellId );
	 }
*/
	 List[0] = MainGrid[x][y]; List[1] = MainGrid[x][y+1]; List[2] = MainGrid[x][y+2];
	 if( CheckSwapCellMatch( List, BREAK_CHAINS ) >= 1 )
		 chaincount++;	 	   
   }
  // horizontal
  for( y = MAIN_GRID_HEIGHT_CELLS; y < MAIN_GRID_HEIGHT_CELLS * 2; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS - 2; x++ )
   {
/*	   
	 if( MainGrid[x][y] == null || MainGrid[x+1][y] == null || MainGrid[x+2][y] == null )
		 continue;
	 
	 if( MainGrid[x][y].CellId == MainGrid[x+1][y].CellId && MainGrid[x+1][y].CellId == MainGrid[x+2][y].CellId )
	 {
		 num = random(0,2);
		 MainGrid[x+num][y].SetIdRandomExcept( MainGrid[x+num][y].CellId );
	 }
*/
	 List[0] = MainGrid[x][y]; List[1] = MainGrid[x+1][y]; List[2] = MainGrid[x+2][y];
	 if( CheckSwapCellMatch( List, BREAK_CHAINS ) >= 1 )
		 chaincount++;		   
   }  	
}
	return chaincount;
}
//--------------------------------------------------------------------------
public int CheckMovesFormChainPossible()
{
  int x, y, i, swappableflag = 0;
  SwapCell[] List = new SwapCell[4];

/*
CheckSwapCellChainSwappable( SwapCell[] List )
{

list items 0, 1, 2 - check for equality
list item 3 - check for inequality
list item 2 - check if moveable 
*/
  //*** vertical ***
  for( y = MAIN_GRID_HEIGHT_CELLS; y < MAIN_GRID_HEIGHT_CELLS * 2 - 2; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ )
   {
     if( x - 1 >= 0 )
     {
/*    	 
       if( MainGrid[x][y].CellId == MainGrid[x][y+1].CellId &&
           MainGrid[x][y+1].CellId != MainGrid[x][y+2].CellId &&
           MainGrid[x-1][y+2].CellId == MainGrid[x][y].CellId )
           swappableflag = 1;
       else
       if( MainGrid[x][y].CellId != MainGrid[x][y+1].CellId &&
           MainGrid[x][y].CellId == MainGrid[x][y+2].CellId &&
           MainGrid[x-1][y+1].CellId == MainGrid[x][y].CellId )
           swappableflag = 1;
       else
       if( MainGrid[x][y].CellId != MainGrid[x][y+1].CellId &&
           MainGrid[x][y+1].CellId == MainGrid[x][y+2].CellId &&
           MainGrid[x-1][y].CellId == MainGrid[x][y+1].CellId )
           swappableflag = 1;
*/
       List[0] = MainGrid[x][y]; List[1] = MainGrid[x][y+1]; List[2] = MainGrid[x-1][y+2]; List[3] = MainGrid[x][y+2];
       if( CheckSwapCellChainSwappable( List ) >= 1 )
    	   return 1;

       List[0] = MainGrid[x][y]; List[1] = MainGrid[x][y+2]; List[2] = MainGrid[x-1][y+1]; List[3] = MainGrid[x][y+1];
       if( CheckSwapCellChainSwappable( List ) >= 1 )
    	   return 1;

       List[0] = MainGrid[x][y+1]; List[1] = MainGrid[x][y+2]; List[2] = MainGrid[x-1][y]; List[3] = MainGrid[x][y];
       if( CheckSwapCellChainSwappable( List ) >= 1 )
    	   return 1;                  	   
     }
     if( swappableflag == 1 )
         return 1;

     if( x + 1 < MAIN_GRID_WIDTH_CELLS )
     {
/*    	 
       if( MainGrid[x][y].CellId == MainGrid[x][y+1].CellId &&
           MainGrid[x][y+1].CellId != MainGrid[x][y+2].CellId &&
           MainGrid[x+1][y+2].CellId == MainGrid[x][y].CellId )
           swappableflag = 1;
       else
       if( MainGrid[x][y].CellId != MainGrid[x][y+1].CellId &&
           MainGrid[x][y].CellId == MainGrid[x][y+2].CellId &&
           MainGrid[x+1][y+1].CellId == MainGrid[x][y].CellId )
           swappableflag = 1;
       else
       if( MainGrid[x][y].CellId != MainGrid[x][y+1].CellId &&
           MainGrid[x][y+1].CellId == MainGrid[x][y+2].CellId &&
           MainGrid[x+1][y].CellId == MainGrid[x][y+1].CellId )
           swappableflag = 1;
*/
       List[0] = MainGrid[x][y]; List[1] = MainGrid[x][y+1]; List[2] = MainGrid[x+1][y+2]; List[3] = MainGrid[x][y+2];
       if( CheckSwapCellChainSwappable( List ) >= 1 )
    	   return 1;

       List[0] = MainGrid[x][y]; List[1] = MainGrid[x][y+2]; List[2] = MainGrid[x+1][y+1]; List[3] = MainGrid[x][y+1];
       if( CheckSwapCellChainSwappable( List ) >= 1 )
    	   return 1;

       List[0] = MainGrid[x][y+1]; List[1] = MainGrid[x][y+2]; List[2] = MainGrid[x+1][y]; List[3] = MainGrid[x][y];
       if( CheckSwapCellChainSwappable( List ) >= 1 )
    	   return 1;          	 
     }
     if( swappableflag == 1 )
         return 1;
   }     

  //*** horizontal ***
  for( y = MAIN_GRID_HEIGHT_CELLS; y < MAIN_GRID_HEIGHT_CELLS * 2; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS - 2; x++ )
   {
     if( y - 1 >= 0 )
     {
/*    	 
       if( MainGrid[x][y].CellId == MainGrid[x+1][y].CellId &&
           MainGrid[x+1][y].CellId != MainGrid[x+2][y].CellId &&
           MainGrid[x+2][y-1].CellId == MainGrid[x][y].CellId )
           swappableflag = 1;
       else
       if( MainGrid[x][y].CellId != MainGrid[x+1][y].CellId &&
           MainGrid[x][y].CellId == MainGrid[x+2][y].CellId &&
           MainGrid[x+1][y-1].CellId == MainGrid[x][y].CellId )
           swappableflag = 1;
       else
       if( MainGrid[x][y].CellId != MainGrid[x+1][y].CellId &&
           MainGrid[x+1][y].CellId == MainGrid[x+2][y].CellId &&
           MainGrid[x][y-1].CellId == MainGrid[x+1][y].CellId )
           swappableflag = 1;
*/
       List[0] = MainGrid[x][y]; List[1] = MainGrid[x+1][y]; List[2] = MainGrid[x+2][y-1]; List[3] = MainGrid[x+2][y];
       if( CheckSwapCellChainSwappable( List ) >= 1 )
    	   return 1;

       List[0] = MainGrid[x][y]; List[1] = MainGrid[x+2][y]; List[2] = MainGrid[x+1][y-1]; List[3] = MainGrid[x+1][y];
       if( CheckSwapCellChainSwappable( List ) >= 1 )
    	   return 1;

       List[0] = MainGrid[x+1][y]; List[1] = MainGrid[x+2][y]; List[2] = MainGrid[x][y-1]; List[3] = MainGrid[x][y];
       if( CheckSwapCellChainSwappable( List ) >= 1 )
    	   return 1;          	 
     }

     if( swappableflag == 1 )
         return 1;

    if( y + 1 < MAIN_GRID_HEIGHT_CELLS * 2 )
    {
/*    	
       if( MainGrid[x][y].CellId == MainGrid[x+1][y].CellId &&
           MainGrid[x+1][y].CellId != MainGrid[x+2][y].CellId &&
           MainGrid[x+2][y-1].CellId == MainGrid[x][y].CellId )
           swappableflag = 1;
       else
       if( MainGrid[x][y].CellId != MainGrid[x+1][y].CellId &&
           MainGrid[x][y].CellId == MainGrid[x+2][y].CellId &&
           MainGrid[x+1][y-1].CellId == MainGrid[x][y].CellId )
           swappableflag = 1;
       else
       if( MainGrid[x][y].CellId != MainGrid[x+1][y].CellId &&
           MainGrid[x+1][y].CellId == MainGrid[x+2][y].CellId &&
           MainGrid[x][y-1].CellId == MainGrid[x+1][y].CellId )
           swappableflag = 1;
*/
       List[0] = MainGrid[x][y]; List[1] = MainGrid[x+1][y]; List[2] = MainGrid[x+2][y+1]; List[3] = MainGrid[x+2][y];
       if( CheckSwapCellChainSwappable( List ) >= 1 )
    	   return 1;

       List[0] = MainGrid[x][y]; List[1] = MainGrid[x+2][y]; List[2] = MainGrid[x+1][y+1]; List[3] = MainGrid[x+1][y];
       if( CheckSwapCellChainSwappable( List ) >= 1 )
    	   return 1;

       List[0] = MainGrid[x+1][y]; List[1] = MainGrid[x+2][y]; List[2] = MainGrid[x][y+1]; List[3] = MainGrid[x][y];
       if( CheckSwapCellChainSwappable( List ) >= 1 )
    	   return 1;        	
     }

     if( swappableflag == 1 )
         return 1;
   }

   return 0;
}
//--------------------------------------------------------------------------
public int CheckSwapCellMatch( SwapCell[] List, int mode )
{
if( List[0] == null || List[1] == null || List[2] == null )
    return 0;

int i;

if( mode == CHECK_CHAINS_POSSIBLE )
{
  if( List[0].CellId == List[1].CellId && List[1].CellId == List[2].CellId )
	if( List[0].SubCellId != SwapCell.SUB_CELL_ID_GARBAGE &&  List[1].SubCellId != SwapCell.SUB_CELL_ID_GARBAGE &&
	    List[2].SubCellId != SwapCell.SUB_CELL_ID_GARBAGE )
      return 1; 
}
else
if( mode == CHECK_AND_REMOVE_CHAINS )
{
  if( List[0].CellId == List[1].CellId && List[1].CellId == List[2].CellId )
	if( List[0].SubCellId != SwapCell.SUB_CELL_ID_GARBAGE &&  List[1].SubCellId != SwapCell.SUB_CELL_ID_GARBAGE &&
	    List[2].SubCellId != SwapCell.SUB_CELL_ID_GARBAGE )	  
  {
	for( i = 0; i < 3; i++ )
	{	 
	 if( List[i].SubCellId == SwapCell.SUB_CELL_ID_LIVES )
	 {
	   if( List[i].LifeCount >= 0 )
		   List[i].RemoveLifeFlag = 1;
	 }
	 else
       List[i].StatusFlag = SwapCell.STATUS_DYING;
	}
    return 1;
  }
}
else
if( mode == BREAK_CHAINS )
{
 if( List[0].CellId == List[1].CellId && List[1].CellId == List[2].CellId )
   if( List[0].SubCellId != SwapCell.SUB_CELL_ID_GARBAGE &&  List[1].SubCellId != SwapCell.SUB_CELL_ID_GARBAGE &&
	    List[2].SubCellId != SwapCell.SUB_CELL_ID_GARBAGE )	 
 {
   int num;
   num = random(0,2);
   List[num].SetIdRandomExcept( List[num].CellId );
   return 1;
 }
}
   return 0;
}
//--------------------------------------------------------------------------
public int CheckSwapCellChainSwappable( SwapCell[] List )
{
/*
list items 0, 1, 2 - check for equality
list item 3 - check for inequality
list item 2 - check if moveable
*/
if( List[0] != null && List[1] != null && List[2] != null && List[3] != null )
if( List[0].CellId == List[1].CellId && List[1].CellId == List[2].CellId && List[3].CellId != List[0].CellId )
if( List[0].GridY >= MAIN_GRID_HEIGHT_CELLS && List[1].GridY >= MAIN_GRID_HEIGHT_CELLS && List[2].GridY >= MAIN_GRID_HEIGHT_CELLS &&
    List[3].GridY >= MAIN_GRID_HEIGHT_CELLS )
{
  if( List[0].SubCellId != SwapCell.SUB_CELL_ID_GARBAGE &&  List[1].SubCellId != SwapCell.SUB_CELL_ID_GARBAGE &&
	   List[2].SubCellId != SwapCell.SUB_CELL_ID_GARBAGE )	
   if( List[2].CheckMoveable() >= 1 && List[3].CheckMoveable() >= 1 )
   {
    return 1;
   }
}  

return 0;
 
}
//--------------------------------------------------------------------------
protected void PokeHoles()
{
  int x, y, i;
  
  for( i = 0; i < 10; i++ )
  {
	 x = random( 0, MAIN_GRID_WIDTH_CELLS - 1 );
	 y = random( MAIN_GRID_HEIGHT_CELLS + 1, MAIN_GRID_HEIGHT_CELLS * 2 - 1 );
	 
	 if( MainGrid[x][y] != null )
	   MainGrid[x][y].StatusFlag = SwapCell.STATUS_DYING;
  }
}
//--------------------------------------------------------------------------
public void FadeOut( int mode )
{	
FadeOutStatus = FADE_OUT_STATUS_NOTHING; 

if( mode == 0 )
{
//*** start fade out ***	
  FadeOutAllFlag = 1; FadeOutAllCounter = 255;
  return;
}
else
if( mode == 1 )
{
  if( FadeOutAllFlag == 0 )
	  return;
  
  if( FadeOutAllCounter <= FadeOutAllMinAlpha )
  {
	  FadeOutStatus = FADE_OUT_STATUS_DONE;
	  return;
  }
	   
	  FadeOutAllCounter -= FadeOutAllSpeed;

  int x, y;
  
  //*** fade out in progress ***	
  for( y = MAIN_GRID_HEIGHT_CELLS; y < MAIN_GRID_HEIGHT_CELLS * 2; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ )  
	if( MainGrid[x][y] != null )  
      { 
	    MainGrid[x][y].SubCellAlpha -= FadeOutAllSpeed; MainGrid[x][y].AlphaValue -= FadeOutAllSpeed;
	    
	    if( MainGrid[x][y].SubCellAlpha < FadeOutAllMinAlpha )
	    	MainGrid[x][y].SubCellAlpha = FadeOutAllMinAlpha;
	    
	    if( MainGrid[x][y].AlphaValue < FadeOutAllMinAlpha )
	    	MainGrid[x][y].AlphaValue = FadeOutAllMinAlpha;	    
      }	
   FadeOutStatus = FADE_OUT_STATUS_WORKING;
}
}
//--------------------------------------------------------------------------
public void RefillCellsNewLevel()
{	
  int x, y, xpos, ypos;

  X = 0; Y = -1 * MAIN_GRID_HEIGHT_CELLS * TILE_HEIGHT_PIXELS;

  for( y = 0; y < MAIN_GRID_HEIGHT_CELLS; y++ )
   for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ )
    {
      xpos = (int)X + x * TILE_WIDTH_PIXELS;
      ypos = (int)Y + y * TILE_HEIGHT_PIXELS;

      MainGrid[x][y] = CreateRandomSwapCell( x, y, xpos, ypos );
    }	
  
  for( y = MAIN_GRID_HEIGHT_CELLS; y < MAIN_GRID_HEIGHT_CELLS * 2; y++ )
    for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ ) 	
    	 MainGrid[x][y] = null;
/*  
  ShiftCellsDownFlag = SwappingFlag = SwappingSuccessFlag = 0;
  NoMoreMovesFlag = 0;
*/  
 ResetVariables(); 
}
//--------------------------------------------------------------------------
public void SaveFile()
{
int x, y;
StringBuilder sb = new StringBuilder();

sb.append(MAIN_GRID_WIDTH_CELLS + "," + MAIN_GRID_HEIGHT_CELLS + ";" );

  for( y = 0; y < MAIN_GRID_HEIGHT_CELLS * 2; y++ )
    for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ ) 	
    {
      if( MainGrid[x][y] != null )
        sb.append( MainGrid[x][y].GetString() + ";" );
      else
    	sb.append( "0;" );
    }
    
  sb.append( ItsScoreBar.GetString() + ";" );
  
  GE.FileDataStr = sb.toString(); 	
  GE.FileName = FileName;	        	      
  GameEngine.CurrentObj.DoRequest(GameEngine.G_REQUEST_WRITE_FILE);
}
//--------------------------------------------------------------------------
public int LoadFile()
{
  GE.FileName = FileName;	        	      
  GameEngine.CurrentObj.DoRequest(GameEngine.G_REQUEST_READ_FILE);	
  
  if( GE.FileDataStr.length() < 1 )
	  return 0;
  
  String[] List = GE.FileDataStr.split(";");
  String[] SubList;
 
  if( List.length < 2 )
	  return 0;

  SubList = List[0].split(",");
  MAIN_GRID_WIDTH_CELLS = Integer.parseInt(SubList[0]);
  MAIN_GRID_HEIGHT_CELLS = Integer.parseInt(SubList[1]);

  if( List.length < MAIN_GRID_WIDTH_CELLS * MAIN_GRID_HEIGHT_CELLS * 2 )
	  return 0;
  
  int x, y, i;
  
  i = 1;
  for( y = 0; y < MAIN_GRID_HEIGHT_CELLS * 2; y++ )
    for( x = 0; x < MAIN_GRID_WIDTH_CELLS; x++ ) 
    {
    	MainGrid[x][y].ExtractString(List[i]);
    	i++;
    }
  ItsScoreBar.ExtractString(List[i]); 
  
  ResetVariables();
  return 1;
}
//--------------------------------------------------------------------------
public static void ClearFile()
{
  GE.FileDataStr = ""; 	
  GE.FileName = FileName;	        	      
  GameEngine.CurrentObj.DoRequest(GameEngine.G_REQUEST_WRITE_FILE);	
}
//--------------------------------------------------------------------------
protected void ResetVariables()
{
  NoMoreMovesFlag = 0;
  ChainCount = 0;
  FallingHoldCounter = FALLING_HOLD_COUNTER_MAX;
  ShiftCellsDownFlag = 0;
  SwappingFlag = 0;
  SwappingSuccessFlag = 0;
  History[0] = History[1] = null;
}
//--------------------------------------------------------------------------
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class SwapCellDemoDisplay extends GameObject
{
public final static int MAX_SWAP_CELLS = 9;
protected SwapCell[] CellList = new SwapCell[MAX_SWAP_CELLS];
protected int[] ScalePercentChangeDirList = new int[MAX_SWAP_CELLS];
protected int Style = 0;

//-------------------------------------------------------------------------------------
public SwapCellDemoDisplay( int nX, int nY, int nStyle )
{
super();
ClassType[TYPE_SWAP_CELL_DEMO_DISPLAY] = 1;

X = nX; Y = nY;
int i, xpos, ypos, scalepercent;

Style = nStyle;

for( i = 0; i < MAX_SWAP_CELLS; i++ )
{
  CellList[i] = new SwapCell( "", 0, 0, 0, 0 );
  CellList[i] = new SwapCell("SC", 0,0,0,0 );
  
  if( Style == 0 )
  {
	  xpos = nX + SwapCellGrid.TILE_WIDTH_PIXELS/2 * i;
	  ypos = nY;
	  scalepercent = 50;
	  ScalePercentChangeDirList[i] = 0;
  }  
  else
  {
	  xpos = nX + i * SwapCellGrid.TILE_WIDTH_PIXELS + 
			  GameGlobals.random( -SwapCellGrid.TILE_WIDTH_PIXELS, SwapCellGrid.TILE_WIDTH_PIXELS );
	  ypos = nY + GameGlobals.random( -SwapCellGrid.TILE_HEIGHT_PIXELS, SwapCellGrid.TILE_HEIGHT_PIXELS );
	  
	  ScalePercentChangeDirList[i] = 1 + -2 * GameGlobals.random(0,1);
	  
	  scalepercent = GameGlobals.random( 10, 100 );
  }
  
  CellList[i].Create_WidthxHeight( xpos, ypos, SwapCellGrid.TILE_WIDTH_PIXELS, SwapCellGrid.TILE_HEIGHT_PIXELS, 
    GameGlobals.GROUP_ID_NONE, GameGlobals.UNIQUE_ID_NONE, 
    GE.LAYER_2, GE.LAYER_1, GameControl.IMAGE_GEM_TILES_0, 0, 0, 255 );
  CellList[i].XScalePercent = CellList[i].YScalePercent = scalepercent;
  CellList[i].SetId(i + 1);
}
}
//-------------------------------------------------------------------------------------
public void Update()
{
  int i;
  for( i = 0; i < MAX_SWAP_CELLS; i++ )
    CellList[i].SetId(i + 1);
}
//-------------------------------------------------------------------------------------
public void Draw()
{
  int i;
  for( i = 0; i < MAX_SWAP_CELLS; i++ ) 
       CellList[i].Draw();

}
//-------------------------------------------------------------------------------------
public void Do()
{
  if( Style == 0 )
	  return;
  
  int i;
  for( i = 0; i < MAX_SWAP_CELLS; i++ ) 
  {
	 CellList[i].XScalePercent += ScalePercentChangeDirList[i];
	 CellList[i].YScalePercent += ScalePercentChangeDirList[i];
	 
	 if( CellList[i].XScalePercent > 100 )
	 {
		 ScalePercentChangeDirList[i] = -1;
	     CellList[i].XScalePercent = CellList[i].YScalePercent = 100;
	 }
	 else
	 if( CellList[i].XScalePercent <= 0 )
	 {
		 ScalePercentChangeDirList[i] = 1;
	     CellList[i].XScalePercent = CellList[i].YScalePercent = 1;
	 }	 
  }
    	
}
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class ScoreBar extends GameObject
{
public final static int MIN_SCORE_DIGITS = 7;
public final static int MAX_SCORE = 99999999;
protected int AlphaValue = 255;

protected int UnitPictureIndex;
public int MaxUnitCount;
protected int UnitWidthPixels;
protected int UnitHeightPixels;
public float CurrentUnitValue = 0.0f;
protected int BarX = 0, BarY = 0;

protected CustomDrawText ItsCustomDrawText;
public int WorkingScore, CurrentScore;
public int CurrentLevel = 1;

public final static int SCORE_BAR_SIZE_30 = 30;
public int VisibleFlag = 1;

//-------------------------------------------------------------------------------------
public ScoreBar()
{
  super();
  ClassType[TYPE_SCORE_BAR] = 1;
  PictureLayer = GE.LAYER_2;
}
//-------------------------------------------------------------------------------------
public String GetString()
{
   StringBuilder sb = new StringBuilder();

   sb.append(UnitPictureIndex + "," );
   sb.append(MaxUnitCount + "," );
   sb.append(UnitWidthPixels + "," );
   sb.append(UnitHeightPixels + "," );
   sb.append(BarX + "," + BarY + ",");
   sb.append((int)(CurrentUnitValue * 1000 ) + "," );
   sb.append(WorkingScore + "," + CurrentScore + ",");
   sb.append(CurrentLevel);
   
   
   return sb.toString();	
}
//-------------------------------------------------------------------------------------
public int ExtractString( String str )
{
   String[] List = str.split(",");
		   
   if( List.length < 10 )
	   return 0;
   
   UnitPictureIndex = Integer.parseInt(List[0]);
   MaxUnitCount = Integer.parseInt(List[1]);
   UnitWidthPixels = Integer.parseInt(List[2]);
   UnitHeightPixels = Integer.parseInt(List[3]);
   BarX = Integer.parseInt(List[4]);
   BarY = Integer.parseInt(List[5]);
   CurrentUnitValue = Integer.parseInt(List[6])/1000.0f;
   WorkingScore = Integer.parseInt(List[7]);
   CurrentScore = Integer.parseInt(List[8]);
   CurrentLevel = Integer.parseInt(List[9]);		  
   ItsCustomDrawText.SetText( SetMinTextWidthLeft( "" + CurrentScore, "0", MIN_SCORE_DIGITS ) );
   
   return 1;
}
//-------------------------------------------------------------------------------------
public void Init()
{
//*** 3 designs ***
/*	
  SetBarDetails( 20, 480 - 27, GameControl.IMAGE_SCORE_BAR, 5, 20, SCORE_BAR_SIZE_30 );
  SetScoreDetails( 320/2, 480-27, GameControl.IMAGE_FONT_LM_18x27, 18, 27 ); 
*/
	
  int y = SwapCellGrid.MAIN_GRID_HEIGHT_CELLS * SwapCellGrid.TILE_HEIGHT_PIXELS + 10;
  
  SetBarDetails( 20, y, GameControl.IMAGE_SCORE_BAR, 5, 20, SCORE_BAR_SIZE_30 );
  SetScoreDetails( 320/2, y, GameControl.IMAGE_FONT_LM_18x27, 18, 27 ); 
  
  ItsCustomDrawText.SetText( SetMinTextWidthLeft( "" + CurrentScore, "0", MIN_SCORE_DIGITS ) );
}
//-------------------------------------------------------------------------------------
public void SetBarDetails( int nBarX, int nBarY, int nUnitPictureIndex,  
                 int nUnitWidthPixels, int nUnitHeightPixels, int nMaxUnitCount )
{
BarX = nBarX; BarY = nBarY;
UnitPictureIndex = nUnitPictureIndex;
MaxUnitCount = nMaxUnitCount;
UnitWidthPixels = nUnitWidthPixels;
UnitHeightPixels = nUnitHeightPixels;
}
//-------------------------------------------------------------------------------------
public void SetScoreDetails( int nX, int nY, int nFontImageIndex, int nFontWidthPixels, int nFontHeightPixels )
{
ItsCustomDrawText = new CustomDrawText( nX, nY, nFontImageIndex, nFontWidthPixels, nFontHeightPixels );
WorkingScore = CurrentScore = 0;
}
//-------------------------------------------------------------------------------------
public void Draw()
{
  int x, y, i;
  if( VisibleFlag == 0 )
	  return;

//*** draw bar units ***

  for( i = 0; i < CurrentUnitValue; i++ )
   GameGlobals.DrawTileImageOne( UnitPictureIndex, BarX + i * (UnitWidthPixels - 1), BarY, PictureLayer, AlphaValue, 
       3, 0, UnitWidthPixels, UnitHeightPixels );

//*** draw bar outline ***
   GameGlobals.DrawTileImageOne( UnitPictureIndex, BarX + 0 * (UnitWidthPixels - 1), BarY, PictureLayer, AlphaValue, 
       0, 0, UnitWidthPixels, UnitHeightPixels );

  for( i = 1; i < MaxUnitCount - 1; i++ )
   GameGlobals.DrawTileImageOne( UnitPictureIndex, BarX + i * (UnitWidthPixels - 1), BarY, PictureLayer, AlphaValue, 
       1, 0, UnitWidthPixels, UnitHeightPixels );

   GameGlobals.DrawTileImageOne( UnitPictureIndex, BarX + (MaxUnitCount - 1) * (UnitWidthPixels - 1), BarY, PictureLayer, AlphaValue, 
       2, 0, UnitWidthPixels, UnitHeightPixels );

//*** draw score ***

   ItsCustomDrawText.Draw();
}
//-------------------------------------------------------------------------------------
public String SetMinTextWidthLeft( String str, String pad_char, int min_width )
{
  int i, difference, length = str.length();

  if( length < min_width )
  {
    StringBuilder strb = new StringBuilder();
    difference = min_width - length;

    for( i = 0; i < difference; i++ )
        strb.append(pad_char);
    
    strb.append(str);
    return strb.toString();
  }
  else
    return str;
}
//-------------------------------------------------------------------------------------
public void AddScore( int nValue )
{
   WorkingScore += nValue;
}
//-------------------------------------------------------------------------------------
public void Do()
{
  if( WorkingScore > 0 )
  {  
     WorkingScore--;
     CurrentScore++;        
     
     if( CurrentScore > MAX_SCORE )
         CurrentScore = MAX_SCORE; 

     ItsCustomDrawText.SetText( SetMinTextWidthLeft( "" + CurrentScore, "0", MIN_SCORE_DIGITS ) );     
  }
}
//-------------------------------------------------------------------------------------
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class SwapCellGridController extends GameObject
{
public final static int GAME_STATE_GOTO_HIGHSCORE = -1;	
public final static int GAME_STATE_END = 0;
public final static int GAME_STATE_PLAYING = 1;
public final static int GAME_STATE_NEXT_LEVEL_INTERMISSION = 2;
public final static int GAME_STATE_NO_MORE_MOVES_INTERMISSION = 3;
public final static int GAME_STATE_TIME_OUT_INTERMISSION = 4;

public static int GameState;
public int MessageTickCounter, MessageTickCounterMax = 50;

protected SwapCellGrid ItsSwapCellGrid;
protected ScoreBar ItsScoreBar;
protected CustomDrawText ItsCustomDrawTextMessage;

public float ScoreBarScaling = 1.0f;

public final static int LOAD_FILE = 1, SAVE_FILE = 2;

public static SwapCellGridController CurrentObj = null;

//--------------------------------------------------------------------------
public SwapCellGridController()
{
  super();
  ClassType[TYPE_SWAP_CELL_GRID_CONTROLLER] = 1;
  PictureLayer = GE.LAYER_3;
  MouseEventNotifyFlag = true;

  ItsCustomDrawTextMessage = new CustomDrawText( 0, 0, GameControl.IMAGE_FONT_LM_18x27, 18, 27 );

  ItsSwapCellGrid = new SwapCellGrid();
  ItsSwapCellGrid.Init();
  ItsScoreBar =  ItsSwapCellGrid.ItsScoreBar;
  GameState = GAME_STATE_PLAYING;
  
 if( GameOptions.CurrentGameType == GameOptions.GAME_COUNT_DOWN ||
     GameOptions.CurrentGameType == GameOptions.GAME_SPECIAL )
     ItsScoreBar.CurrentUnitValue = ItsScoreBar.MaxUnitCount;
 
  CurrentObj = this;
}
//--------------------------------------------------------------------------
public void AddScore( int score_value )
{
 ItsScoreBar.AddScore( score_value * 10 );

 if( GameOptions.CurrentGameType == GameOptions.GAME_NORMAL ||
     GameOptions.CurrentGameType == GameOptions.GAME_INFINITE )
 {
   float score_scaling = (100.0f - ItsScoreBar.CurrentLevel ) / 100.0f;
   if( score_scaling < 0.05f )
       score_scaling = 0.05f;

   ItsScoreBar.CurrentUnitValue += score_value * score_scaling * ScoreBarScaling;

   if( ItsScoreBar.CurrentUnitValue > ItsScoreBar.MaxUnitCount )
   {
      ItsScoreBar.CurrentUnitValue = 0.0f;
      GameState = GAME_STATE_NEXT_LEVEL_INTERMISSION;
      DoTextMessage(0);
      ItsSwapCellGrid.FadeOut(0);
   }
 }
 else
 if( GameOptions.CurrentGameType == GameOptions.GAME_COUNT_DOWN ||
     GameOptions.CurrentGameType == GameOptions.GAME_SPECIAL )
 {
   ItsScoreBar.CurrentUnitValue += score_value * ScoreBarScaling;

   if( ItsScoreBar.CurrentUnitValue > ItsScoreBar.MaxUnitCount )
      ItsScoreBar.CurrentUnitValue = ItsScoreBar.MaxUnitCount;
 }
}
//--------------------------------------------------------------------------
public void Do()
{
 ItsSwapCellGrid.Do();

 if( GameState == GAME_STATE_PLAYING )
 {
     if( ItsSwapCellGrid.ChainCount > 0 )
     {
    	AddScore(ItsSwapCellGrid.ChainCount);  
    	ItsSwapCellGrid.ChainCount = 0;
     }
     
   if( GameOptions.CurrentGameType == GameOptions.GAME_NORMAL )
   {
     if( ItsSwapCellGrid.NoMoreMovesFlag == 1 )
     {
      GameState = GAME_STATE_NO_MORE_MOVES_INTERMISSION;
      DoTextMessage(0);
      ItsSwapCellGrid.FadeOut(0);
     }
    
    }
   else
   if( GameOptions.CurrentGameType == GameOptions.GAME_COUNT_DOWN ||
       GameOptions.CurrentGameType == GameOptions.GAME_SPECIAL )
   {
     ItsScoreBar.CurrentUnitValue -= 0.030f  * ScoreBarScaling;

     if( ItsScoreBar.CurrentUnitValue <= 0 )
     {
       ItsScoreBar.CurrentUnitValue = 0;
       GameState = GAME_STATE_TIME_OUT_INTERMISSION;
       DoTextMessage(0);       
       ItsSwapCellGrid.FadeOut(0);
     }
   }
 }
 else
 if( GameState == GAME_STATE_NEXT_LEVEL_INTERMISSION )
 {
   int msg_status = DoTextMessage(1);
   
   if( ItsSwapCellGrid.FadeOutStatus == ItsSwapCellGrid.FADE_OUT_STATUS_DONE && msg_status == 1 )
   {
	 ItsSwapCellGrid.RefillCellsNewLevel();
     ItsSwapCellGrid.FadeOutAllFlag = 0;
     ItsSwapCellGrid.StartShiftCellsDownAlt();
     GameState = GAME_STATE_PLAYING;
      ItsSwapCellGrid.ItsScoreBar.VisibleFlag = 1;
   }	 
 }
 else
 if( GameState == GAME_STATE_NO_MORE_MOVES_INTERMISSION || 
     GameState == GAME_STATE_TIME_OUT_INTERMISSION )
 {
    DoTextMessage(1);
    ItsSwapCellGrid.ItsScoreBar.VisibleFlag = 0;
    
   if( MessageTickCounter >= MessageTickCounterMax )
   {
	   GameOptions.CurrentPlayerScore = ItsScoreBar.CurrentScore + ItsScoreBar.WorkingScore;
	   
	   if( HighScores.CurrentObj.CheckNewHighScore( GameOptions.CurrentGameType, GameOptions.CurrentPlayerScore ) >= 1 )
	       GameState = GAME_STATE_GOTO_HIGHSCORE;
	   else
		   GameState = GAME_STATE_END;
	   
	   ItsSwapCellGrid.ClearFile();
   }
 }
}
//--------------------------------------------------------------------------
public void Draw()
{
  ItsSwapCellGrid.Draw();

if( GameState == GAME_STATE_NEXT_LEVEL_INTERMISSION ||
    GameState == GAME_STATE_NO_MORE_MOVES_INTERMISSION || 
    GameState == GAME_STATE_TIME_OUT_INTERMISSION )
  ItsCustomDrawTextMessage.Draw();

}
//--------------------------------------------------------------------------
public int DoTextMessage( int option )
{
if( option == 0 )
{
  MessageTickCounter = 1;
  ItsCustomDrawTextMessage.Y = 0;   
     
  if( GameState == GAME_STATE_NEXT_LEVEL_INTERMISSION )
  {
    ItsScoreBar.CurrentLevel++;
    ItsCustomDrawTextMessage.SetText("ZONE " + ItsScoreBar.CurrentLevel );    
    ItsCustomDrawTextMessage.X = GameEngine.TARGET_SCREEN_WIDTH/2 - ItsCustomDrawTextMessage.GetStringWidthPixels()/2; 
     ItsSwapCellGrid.ItsScoreBar.VisibleFlag = 0;
  }
  else
  if( GameState == GAME_STATE_NO_MORE_MOVES_INTERMISSION )
  {
    ItsCustomDrawTextMessage.SetText("IMPOSSIBLE!");
    ItsCustomDrawTextMessage.X = GameEngine.TARGET_SCREEN_WIDTH/2 - ItsCustomDrawTextMessage.GetStringWidthPixels()/2; 
  }
  else
  if( GameState == GAME_STATE_TIME_OUT_INTERMISSION )
  {	  
    ItsCustomDrawTextMessage.SetText("TIME RAN OUT!");
    ItsCustomDrawTextMessage.X = GameEngine.TARGET_SCREEN_WIDTH/2 - ItsCustomDrawTextMessage.GetStringWidthPixels()/2; 
  }
} 
else
if( option == 1 )
{
   if( MessageTickCounter >= MessageTickCounterMax )
   {
       MessageTickCounter = MessageTickCounterMax;
       return 1;
   }
   ItsCustomDrawTextMessage.Y += 5;
   MessageTickCounter++;
}

   return 0;
}
//--------------------------------------------------------------------------
public void OnClick()
{
   ItsSwapCellGrid.OnClick();
}
//--------------------------------------------------------------------------
public int DoFile( int choice )
{
int retvalue = 1;

if( choice == LOAD_FILE )
	retvalue = ItsSwapCellGrid.LoadFile();
else
if( choice == SAVE_FILE )
	ItsSwapCellGrid.SaveFile();

   return retvalue;

}
//--------------------------------------------------------------------------
}

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class CustomDrawText extends GameObject
{

protected int FontImageIndex = GameControl.IMAGE_FONT_LM_18x27;
protected int FontWidthPixels = 18;
protected int FontHeightPixels = 27;

protected String Text;
protected int TextLength = 0;
protected int AlphaValue = 255;

//-------------------------------------------------------------------------------------
public CustomDrawText( int nX, int nY, int nFontImageIndex, int nFontWidthPixels, int nFontHeightPixels )
{
super();
ClassType[TYPE_CUSTOM_DRAW_TEXT] = 1;
MouseEventNotifyFlag = false;
PictureLayer = GE.LAYER_2;
TextLayer = GE.LAYER_2;
X = nX; Y = nY;
FontImageIndex = nFontImageIndex; FontWidthPixels = nFontWidthPixels; FontHeightPixels = nFontHeightPixels;
}
//-------------------------------------------------------------------------------------
public void SetText( String str )
{
Text = str;
TextLength = str.length();
}
//-------------------------------------------------------------------------------------
public void DrawText( int nX, int nY, String str )
{
  int i, x = 0, y = 0, textlength = str.length();
  char c;
  
  for( i = 0; i < textlength; i++ )
  {
    c = str.charAt(i);
    
    if( c == 13 )
    	continue;
    else
    if( c == 10 )
    {
    	y += FontHeightPixels;
    	x = 0;
    	continue;
    }
    
    GameGlobals.DrawTileImageOne( FontImageIndex, nX + x, nY + y, PictureLayer, AlphaValue, 0, c,
	    	FontWidthPixels, FontHeightPixels );
    
    x += FontWidthPixels;
  }
}
//-------------------------------------------------------------------------------------
public void Draw()
{
  int i, x = 0, y = 0;
  char c;
  
  for( i = 0; i < TextLength; i++ )
  {
    c = Text.charAt(i);
    
    if( c == 13 )
    	continue;
    else
    if( c == 10 )
    {
    	y += FontHeightPixels;
    	x = 0;
    	continue;
    }
    
    GameGlobals.DrawTileImageOne( FontImageIndex, (int)X + x, (int)Y + y, PictureLayer, AlphaValue, 0, c,
	    	FontWidthPixels, FontHeightPixels);
    
    x += FontWidthPixels;
  }
}
//-------------------------------------------------------------------------------------
public int GetStringWidthPixels()
{
	return FontWidthPixels * TextLength;
}
//-------------------------------------------------------------------------------------
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class Caption extends GameObject
{
  public static final int STYLE_TEXT = 0;
  public static final int STYLE_PICTURE = 1;
  public static final int STYLE_TEXT_PICTURE = 2;

  protected int Style;  
  protected int PictureIndex;
  protected int FontSize;
  protected int FontColor;
  protected String Text;
  protected int TextRelativeX;
  protected int TextRelativeY;    
  protected int DistanceBetweenLines;
  protected boolean MultiLineFlag;
  protected boolean DrawCursorFlag;
  protected int CursorCharPosition;
  
  protected int PictureIndex_TileX, PictureIndex_TileY;
  protected int PictureWidthCells, PictureHeightCells;
  protected int TileWidthPixels, TileHeightPixels;
  protected int AlphaValue = 255;  
  
  protected int TileImageFlag = 0;
  
  public static int TextShadowFlag = 1;
  public static int TextShadowColor = Color.rgb(20,20,20);
  public static int TextShadowDisplaceX = -1;
  public static int TextShadowDisplaceY = -1;
  public static int TextShadowCount = 2;
  
//-------------------------------------------------------------------------------------
 public Caption()
 {
  super();
  ClassType[TYPE_CAPTION] = 1;	
  PictureIndex_TileX = PictureIndex_TileY = -1;
 }
 //-------------------------------------------------------------------------------------
public Caption( int nX, int nY, int nPictureIndex )
{
 super();
 ClassType[TYPE_CAPTION] = 1;
 FontSize = 20;
 FontColor = Color.rgb(255,255,255);
 TextRelativeX = 0; TextRelativeY = 20;
	  
  Style = STYLE_PICTURE;
  X = nX; Y = nY; PictureIndex = nPictureIndex;
  MultiLineFlag = false;
  DistanceBetweenLines = 20;
  PictureLayer = GE.LAYER_1;
  TextLayer = GE.LAYER_2;  
  DrawCursorFlag = false;
  
  PictureIndex_TileX = PictureIndex_TileY = -1;
}
//-------------------------------------------------------------------------------------
public Caption( int nX, int nY, String sText )
{
  super();
  ClassType[TYPE_CAPTION] = 1;
  FontSize = 20;
  FontColor = Color.rgb(255,255,255);
  TextRelativeX = 0; TextRelativeY = 20;
	 
  Style = STYLE_TEXT;
  X = nX; Y = nY; Text = new String(sText);
  MultiLineFlag = false;
  DistanceBetweenLines = 20;
  PictureLayer = GE.LAYER_1;
  TextLayer = GE.LAYER_2;    
  DrawCursorFlag = false;
  
  PictureIndex_TileX = PictureIndex_TileY = -1;
}
//-------------------------------------------------------------------------------------
public void SetTextOptions( int nFontSize, int nColor, int nTextRelativeX, int nTextRelativeY, boolean bMultiLineFlag,
   int nDistanceBetweenLines )
{
   FontSize = nFontSize;
   FontColor = nColor;
   TextRelativeX = nTextRelativeX;
   TextRelativeY = nTextRelativeY;
   MultiLineFlag = bMultiLineFlag;
   DistanceBetweenLines = nDistanceBetweenLines;
}
//-------------------------------------------------------------------------------------
public void SetText( String sText )
{
  Text = new String(sText);
}
//-------------------------------------------------------------------------------------
public void SetTextPicture( String sText, int nPictureIndex )
{
  Text = new String(sText);
  PictureIndex = nPictureIndex;
  Style = STYLE_TEXT_PICTURE;
}
//-------------------------------------------------------------------------------------
public void Draw() 
{
 int i, k;
 
 if( Style == STYLE_TEXT || Style == STYLE_TEXT_PICTURE )
 {
  if( !MultiLineFlag )
  {
	
   if( TextShadowFlag >= 1 )
   {
    for( i = 1; i <= TextShadowCount; i++ )   
       GE.DrawTextColor( Text,(int)(X + TextRelativeX + TextShadowDisplaceX * i), (int)(Y + TextRelativeY + TextShadowDisplaceY * i), 
         TextLayer, TextShadowColor, FontSize );
   }
   
   GE.DrawTextColor( Text,(int)(X + TextRelativeX), (int)(Y + TextRelativeY), 
       TextLayer, FontColor, FontSize );
   
   if( DrawCursorFlag )
   {
	  int length = Text.length();
	  char[] chlist = new char[length];	  

	  for( i = 0; i < length; i++ )
		   chlist[i] = ' ';
	  chlist[CursorCharPosition] = '_';
	  String cursorstr = new String(chlist);
	  
	   if( TextShadowFlag >= 1 )
	   {
	    for( i = 1; i <= TextShadowCount; i++ )   
         GE.DrawTextColor( cursorstr,(int)(X + TextRelativeX + TextShadowDisplaceX * i), (int)(Y + TextRelativeY + TextShadowDisplaceY * i), 
         TextLayer, TextShadowColor, FontSize );
	   }
	   
	   GE.DrawTextColor( cursorstr,(int)(X + TextRelativeX), (int)(Y + TextRelativeY), 
		       TextLayer, FontColor, FontSize );	  
   }
  }
  else
  {
   int LineY;
   String[] StrLines = Text.split("\n");
   
   for( i = 0, LineY = 0; i < StrLines.length; i++, LineY += DistanceBetweenLines )
   {
     if( TextShadowFlag >= 1 )
     {
      for( k = 1; k <= TextShadowCount; k++ )   
         GE.DrawTextColor( StrLines[i],(int)(X + TextRelativeX + TextShadowDisplaceX * k), 
           (int)(Y + TextRelativeY + LineY + TextShadowDisplaceY * k), TextLayer, TextShadowColor, FontSize );
     }
	 
     GE.DrawTextColor( StrLines[i],(int)(X + TextRelativeX), (int)(Y + TextRelativeY + LineY), 
       TextLayer, FontColor, FontSize );      
   }
  }
 }

 if( TileImageFlag == 1 )
     GameGlobals.DrawTileImageOne( PictureIndex, (int)X, (int)Y, PictureLayer, AlphaValue, 0, PictureIndex_TileY, 
    	 TileWidthPixels, TileHeightPixels ); 
 else
 if( Style == STYLE_PICTURE || Style == STYLE_TEXT_PICTURE )
   GE.DrawImage( PictureIndex, (int)X, (int)Y, PictureLayer );    
}
//-------------------------------------------------------------------------------------
public void SetTileStyle( int nPictureIndex, 
		  int nPictureIndex_TileX, int nPictureIndex_TileY,
		  int nPictureWidthCells, int nPictureHeightCells,
		  int nTileWidthPixels, int nTileHeightPixels,
		  int nAlphaValue )
{
	  PictureIndex = nPictureIndex;
	  PictureIndex_TileX = nPictureIndex_TileX;
	  PictureIndex_TileY = nPictureIndex_TileY;
	  PictureWidthCells = nPictureWidthCells;
	  PictureHeightCells = nPictureHeightCells;
	  TileWidthPixels = nTileWidthPixels;
	  TileHeightPixels = nTileHeightPixels;
	  AlphaValue = nAlphaValue;  	  	  
}
//-------------------------------------------------------------------------------------
public void SetFontColor( int nColor)
{
	FontColor = nColor;	
}
//-------------------------------------------------------------------------------------
public Caption( int nX, int nY, int nGroupId, int nUniqueId, int nStyle, int nTextLayer, int nPictureLayer )
{	
  super();
  ClassType[TYPE_CAPTION] = 1;
  
  X = nX; Y = nY;
  GroupId = nGroupId; UniqueId = nUniqueId;
  Style = nStyle; 
  
  if( nTextLayer < 0 || nPictureLayer < 0 )
  {
	  TextLayer = GE.LAYER_2; PictureLayer = GE.LAYER_1;	 
  }
  else
  {
    TextLayer = nTextLayer; PictureLayer = nPictureLayer;
  }
}
//-------------------------------------------------------------------------------------
public void Init_1( String str, int nFontSize, int nColor, int nTextRelativeX, int nTextRelativeY, boolean bMultiLineFlag,
   int nDistanceBetweenLines )
{
	Text = new String(str);
	
   FontSize = nFontSize;
   FontColor = nColor;
   TextRelativeX = nTextRelativeX;
   TextRelativeY = nTextRelativeY;
   MultiLineFlag = bMultiLineFlag;
   DistanceBetweenLines = nDistanceBetweenLines;	
}
//-------------------------------------------------------------------------------------
public void Init_2( int nPictureIndex, int nWidth, int nHeight, int nRowIndex0, int nAlphaValue, int nTileImageFlag )
{
  int ScaledWidth = (int)(GameControl.ImageScaleRelative_320x480[nPictureIndex] * nWidth);
  int ScaledHeight = (int)(GameControl.ImageScaleRelative_320x480[nPictureIndex] * nHeight);  

  SetTileStyle( nPictureIndex, 0, nRowIndex0,  1, 1, ScaledWidth, ScaledHeight, nAlphaValue );
  TileImageFlag = nTileImageFlag;
}
//-------------------------------------------------------------------------------------
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class CopyRightCaption extends GameObject
{
protected int FontColor, FontShadowColor, FontSize, FontWidth, FontHeight;
protected String Text;

//-------------------------------------------------------------------------------------
public CopyRightCaption()
{
  FontColor = GameOptions.MainFontColor;
  FontShadowColor = Color.rgb( 20, 20, 20 );
  FontSize = 12;

  Text = "© 2014 Y.X.Y. All Rights Reserved.";
  String teststr = "X                                                    X";

  Paint paintobj = new Paint();
  paintobj.setTypeface(Typeface.MONOSPACE);
  paintobj.setTextSize(FontSize);

  Rect bounds = new Rect();  
  paintobj.getTextBounds(teststr, 0, teststr.length(), bounds);
  
  FontHeight = bounds.height();
  FontWidth = bounds.width() / teststr.length();

  PictureLayer = GE.LAYER_2;
  TextLayer = GE.LAYER_4;
  ClassType[TYPE_COPYRIGHT_CAPTION] = 1;
  
  paintobj.getTextBounds(Text, 0, Text.length(), bounds);
  
  X = GameEngine.TARGET_SCREEN_WIDTH/2 - (bounds.width()/2)/(GE.Xscale);
  Y = GameEngine.TARGET_SCREEN_HEIGHT - 5 + GameGlobals.Y_SHIFT;
}
//-------------------------------------------------------------------------------------
public void Draw()
{
   GE.DrawTextColor( Text, (int)X - 1, (int)Y - 1, TextLayer, FontShadowColor, FontSize );	
   GE.DrawTextColor( Text, (int)X, (int)Y, TextLayer, FontColor, FontSize );	
}
//-------------------------------------------------------------------------------------
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class CaptionBox extends GameObject
{
protected int FontColor, FontSize, FontWidth, FontHeight, BoxColor;
public final static int MAX_LINES = 20000;
public final static int VERTICAL_FONT_SPACING = 3;

protected int LineIndex, TotalLines;
protected int BoxWidthPixels, BoxHeightPixels, MaxColumns, MaxRows;
protected String[] TextList;
protected int TopLeftX, TopLeftY;

protected String[] VisibleTextList;
protected char[] TextCharArray;

//-------------------------------------------------------------------------------------
public CaptionBox( int nFontSize, int nFontColor, int nTopLeftX, int nTopLeftY,
                   int nBoxWidthPixels, int nBoxHeightPixels, int nBoxColor )
{
super();

String teststr = "X                                                    X";

FontSize = nFontSize; FontColor = nFontColor; BoxColor = nBoxColor;
TopLeftX = nTopLeftX; TopLeftY = nTopLeftY;
BoxWidthPixels = nBoxWidthPixels; BoxHeightPixels = nBoxHeightPixels;

Paint paintobj = new Paint();
paintobj.setTypeface(Typeface.MONOSPACE);
paintobj.setTextSize(FontSize);

Rect bounds = new Rect();
paintobj.getTextBounds(teststr, 0, teststr.length(), bounds);

FontHeight = bounds.height() + VERTICAL_FONT_SPACING;
FontWidth = bounds.width() / teststr.length();

MaxColumns = (int)(BoxWidthPixels / FontWidth * GE.Xscale);
MaxRows = BoxHeightPixels / FontHeight;
LineIndex = 0;
VisibleTextList = new String[MaxRows];

PictureLayer = GE.LAYER_2;
TextLayer = GE.LAYER_4;
ClassType[TYPE_CAPTION_BOX] = 1;

}
//-------------------------------------------------------------------------------------
public void SetText( String str )
{
if( str.length() < 1 )
    str = " ";
str = str.replace("\r\n", "\n");

int strlength = str.length();
int i, k, ColumnCellCount, WhiteSpaceCount;
char ch; 
StringBuilder sb = new StringBuilder();

char[] char_array = new char[strlength+1];
char[] char_array_nl = new char[strlength+1];

str.getChars (0, strlength-1, char_array, 0);
strlength = char_array.length;

ColumnCellCount = WhiteSpaceCount = 0;

for( i = 0; i < strlength; )
{	
   ch = char_array[i];
     
   if( ch == '\n' )
     ColumnCellCount = 0;
   else        
     ColumnCellCount++;
     
   if( ch == 0x20 || ch == 0x09 || ch == '\n' )  
	   WhiteSpaceCount++;
       
   if( ColumnCellCount >= MaxColumns )
   {     
    if( ch != 0x20 && ch != 0x09 && ch != '\n' )
    {     
      if( WhiteSpaceCount >= 1 )
      {
	    for( k = i - 1; k > 0; k-- )
	    {
		 ch = char_array[k];
		 if( ch == 0x20 || ch == 0x09 || ch == '\n' )
			 break;
	     }
         char_array[k] = '\n';
         i = k;
      }
      else
      {
         char_array_nl[i] = '\n';
      }
      
      WhiteSpaceCount = ColumnCellCount = 0;
    }
    else
      char_array[i] = '\n';
   
   }
   i++;
}

  for( i = 0; i < strlength; i++ )
  {
     sb.append(char_array[i]);
     if( char_array_nl[i] == '\n' )
         sb.append('\n');
  }
//TextList = str.split("\n");
//TotalLines = TextList.length;
//LineIndex = 0;

  str = sb.toString();
  TextCharArray = new char[str.length()];
  str.getChars (0, str.length()-1, TextCharArray, 0);

  TotalLines = 0;
  for( i = 0; i < TextCharArray.length; i++ )
	if( TextCharArray[i] == '\n' )
		TotalLines++;
	else
	if( i == strlength - 1 )
		TotalLines++;   

  SetLineIndex(0);

}
//-------------------------------------------------------------------------------------
public void SetLineIndex( int nLineIndex )
{
	if( nLineIndex >= 0 && nLineIndex < TotalLines )
	  LineIndex = nLineIndex;
	
   StringBuilder sb = new StringBuilder();
   int i, j, k, countlineindex = 0, visiblelineindex = 0;
 
   j = 0;
   
   for( i = 0; i < TextCharArray.length; i++ )
   { 
	 if( LineIndex == countlineindex )
	 {
	    for( k = i; k < TextCharArray.length; k++ )
	    {
	      sb.append(TextCharArray[k]);
	      if( TextCharArray[k] == '\n' )
		      visiblelineindex++;	  
	      if( visiblelineindex >= MaxRows - 1 )
	    	  break;
	    }	
	    break;
	 }

	 if( TextCharArray[i] == '\n' )
		 countlineindex++;
   } 
   VisibleTextList = sb.toString().split("\n");
  
}
//-------------------------------------------------------------------------------------
public void MoveIndex( int nDirection )
{
	int nLineIndex = LineIndex + nDirection;
	
	if( nLineIndex >= 0 && nLineIndex < TotalLines )
	  LineIndex = nLineIndex;   	
	SetLineIndex(LineIndex);
}
//-------------------------------------------------------------------------------------
public void Draw()
{
   int i, k, end_index;
   
   GE.DrawBox( TopLeftX, TopLeftY, TopLeftX + BoxWidthPixels + FontWidth, TopLeftY + BoxHeightPixels + FontHeight, 
		   PictureLayer, BoxColor, GameEngine.G_STYLE_FILL );
/*  
   end_index = LineIndex + MaxRows - 1;
   if( end_index > TotalLines - 1 )
	   end_index = TotalLines - 1;
   
   for( i = LineIndex, k = 0; i <= end_index; i++, k++ )	   
   {	   
	  GE.DrawTextColor( TextList[i], TopLeftX + FontWidth, TopLeftY + k * FontHeight + FontHeight, 
		    TextLayer, FontColor, FontSize );		  
   }
*/  
   for( i = 0; i < VisibleTextList.length; i++  )	   
   {	   
	  GE.DrawTextColor( VisibleTextList[i], TopLeftX + FontWidth, TopLeftY + i * FontHeight + FontHeight, 
		    TextLayer, FontColor, FontSize );		  
   }   
}	   
//-------------------------------------------------------------------------------------	   
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class CheckBox extends GameObject
{
  protected final int STYLE_PRIMITIVE = 0;
  protected final int STYLE_PICTURE = 1;

  protected int OuterColor;
  protected int InnerColor;
  protected int Style;
  protected int Width, Height;  
  protected int CheckedPictureIndex;
  protected int UnCheckedPictureIndex;

  public boolean CheckedFlag = false;
  
  protected int CheckedPictureIndex_TileX, CheckedPictureIndex_TileY;
  protected int UnCheckedPictureIndex_TileX, UnCheckedPictureIndex_TileY;
  protected int PictureWidthCells, PictureHeightCells;
  protected int TileWidthPixels, TileHeightPixels;
  protected int AlphaValue;    
  
  protected int DrawAltFlag = 0;
  
//------------------------------------------------------------------------------------- 
public CheckBox( int nX, int nY, boolean bCheckedFlag )
{
  super();  
  ClassType[TYPE_CHECKBOX] = 1;
  MouseEventNotifyFlag = true;
  CheckedFlag = bCheckedFlag;
  X = nX; Y = nY;
  Width = Height = 48;
  SetPrimitiveStyle( Color.rgb(255,0,0), Color.rgb(100,100,100));
  PictureLayer = GE.LAYER_1;
  CheckedPictureIndex_TileX = -1;
}
//-------------------------------------------------------------------------------------
public void SetPrimitiveStyle( int nOuterColor, int nInnerColor )
{
  Style = STYLE_PRIMITIVE;
  OuterColor = nOuterColor;
  InnerColor = nInnerColor;
}
//-------------------------------------------------------------------------------------
public void SetPictureStyle( int nCheckedPictureIndex, int nUnCheckedPictureIndex )
{
  Style = STYLE_PICTURE;
  CheckedPictureIndex = nCheckedPictureIndex;
  UnCheckedPictureIndex = nUnCheckedPictureIndex;
}
//-------------------------------------------------------------------------------------
protected void DrawPrimitive()
{
 GE.DrawBox( X, Y, X+Width, Y+Height, PictureLayer, InnerColor, 
	    	   GameEngine.G_STYLE_FILL ); 	    
 GE.DrawBox( X, Y, X+Width, Y+Height, PictureLayer, OuterColor, 
   GameEngine.G_STYLE_STROKE );    
 
 if( CheckedFlag )
 {
   GE.DrawLine( X, Y + Height/2, X + Width/2, Y + Height, GE.LAYER_1 , OuterColor);
   GE.DrawLine( X + Width/2, Y + Height, X + Width, Y, GE.LAYER_1 , OuterColor);
 }	
}
//-------------------------------------------------------------------------------------
protected void DrawPicture()
{
  if( CheckedPictureIndex_TileX > -1 )
  {
    if( CheckedFlag )  
    	GameGlobals.DrawTileImageGeneralUltra( CheckedPictureIndex, (int)X, (int)Y, PictureLayer, AlphaValue, 
    			CheckedPictureIndex_TileX, CheckedPictureIndex_TileY, 
    	    	PictureWidthCells, PictureHeightCells, TileWidthPixels, TileHeightPixels );      	
    else	
    	GameGlobals.DrawTileImageGeneralUltra( UnCheckedPictureIndex, (int)X, (int)Y, PictureLayer, AlphaValue, 
    			UnCheckedPictureIndex_TileX, UnCheckedPictureIndex_TileY, 
    	    	PictureWidthCells, PictureHeightCells, TileWidthPixels, TileHeightPixels );     	
  }
  else
  {
	 if( CheckedFlag )  
	   GE.DrawImage( CheckedPictureIndex, (int)X, (int)Y, PictureLayer  );
     else
	   GE.DrawImage( UnCheckedPictureIndex, (int)X, (int)Y, PictureLayer  );	
  }
}
//-------------------------------------------------------------------------------------
public void Draw()
{
 if( DrawAltFlag == 1 )
 {
	 DrawAlt();
 }
 else
 {
  if( Style == STYLE_PRIMITIVE )
    DrawPrimitive();
  else
  if( Style == STYLE_PICTURE )
    DrawPicture();
 } 
}
//-------------------------------------------------------------------------------------
protected boolean CheckClickWithin()
{
boolean returnvalue = false;

if( X <= MouseX && MouseX < X + Width &&
    Y <= MouseY && MouseY < Y + Height )
    returnvalue = true;
return returnvalue;    
}
//-------------------------------------------------------------------------------------
public void OnClick() 
{
	int YesFlag = 0;

	if(( MouseStatus == ME_PRESS_DOWN || MouseStatus == ME_MOVE ) && CheckClickWithin() )
	{
		if( InputDelayMax > 0 )
		{
		  if( InputDelayCounter >= InputDelayMax )
		  {	
	        YesFlag = 1;
	        InputDelayCounter = 0;
		  }
		}
		else
		  YesFlag = 1;
		
		if( YesFlag == 1 )
		{
	        if( CheckedFlag )
	            CheckedFlag = false;
	        else
	            CheckedFlag = true;
	 
	        CopyDupInput();
	        OnClickDo();		
		}
		
	}
}
//-------------------------------------------------------------------------------------
protected void OnClickDo()
{
}
//-------------------------------------------------------------------------------------
public void Do()
{
  if( InputDelayCounter < InputDelayMax )
      InputDelayCounter++;	
}
//-------------------------------------------------------------------------------------
public void SetTileStyle( int nCheckedPictureIndex, int nUnCheckedPictureIndex, int nCheckedPictureIndex_TileX,
		   int nCheckedPictureIndex_TileY,  int nUnCheckedPictureIndex_TileX,  int nUnCheckedPictureIndex_TileY,
		   int nPictureWidthCells, int nPictureHeightCells, int nTileWidthPixels,
		   int nTileHeightPixels, int nAlphaValue )
{
		 CheckedPictureIndex = nCheckedPictureIndex;
		 UnCheckedPictureIndex = nUnCheckedPictureIndex;
		 CheckedPictureIndex_TileX = nCheckedPictureIndex_TileX;
		 CheckedPictureIndex_TileY = nCheckedPictureIndex_TileY;
		 UnCheckedPictureIndex_TileX = nUnCheckedPictureIndex_TileX;
		 UnCheckedPictureIndex_TileY = nUnCheckedPictureIndex_TileY;
		 PictureWidthCells = nPictureWidthCells;
		 PictureHeightCells = nPictureHeightCells;
		 TileWidthPixels = nTileWidthPixels;
		 TileHeightPixels = nTileHeightPixels;
		 AlphaValue = nAlphaValue; 	
}
//-------------------------------------------------------------------------------------
public CheckBox( int nX, int nY, int nWidth, int nHeight, int nGroupId, int nUniqueId, int nPictureLayer,
		int nPictureIndex, int nRowIndex0, int nRowIndex1, int nAlpha, boolean bCheckedFlag )
{
  super();  
  ClassType[TYPE_CHECKBOX] = 1;
  MouseEventNotifyFlag = true;
  CheckedFlag = bCheckedFlag;
  X = nX; Y = nY;  Width = nWidth; Height = nHeight;
  GroupId = nGroupId; UniqueId = nUniqueId;
  PictureLayer = nPictureLayer; 
  
int ScaledWidth = (int)(GameControl.ImageScaleRelative_320x480[nPictureIndex] * Width);
int ScaledHeight = (int)(GameControl.ImageScaleRelative_320x480[nPictureIndex] * Height);  

DrawAltFlag = 1;

SetTileStyle( nPictureIndex, nPictureIndex, 0, nRowIndex1,  0,  nRowIndex0,
		   1, 1, ScaledWidth, ScaledHeight, nAlpha );

}
//-------------------------------------------------------------------------------------
protected void DrawAlt()
{
 if( CheckedFlag )
     GameGlobals.DrawTileImageOne( CheckedPictureIndex, (int)X, (int)Y, PictureLayer, AlphaValue, 0, CheckedPictureIndex_TileY, 
    	 TileWidthPixels, TileHeightPixels );
 else
     GameGlobals.DrawTileImageOne( UnCheckedPictureIndex, (int)X, (int)Y, PictureLayer, AlphaValue, 0, UnCheckedPictureIndex_TileY, 
    	 TileWidthPixels, TileHeightPixels );        	
}
//-------------------------------------------------------------------------------------
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class RadioButton extends CheckBox
{

private final int MAX_RADIO_BUTTON_LIST_LENGTH = 12;
private RadioButton[] List;
private int ListCount;

//-------------------------------------------------------------------------------------
public RadioButton( int nX, int nY, boolean bCheckedFlag )
{
   super( nX, nY, bCheckedFlag );
   ClassType[TYPE_RADIO_BUTTON] = 1;
   ListCount = 0;
   List = new RadioButton[MAX_RADIO_BUTTON_LIST_LENGTH];
   PictureLayer = GE.LAYER_1; 
}
//-------------------------------------------------------------------------------------
protected void CopyDaisyChain( RadioButton DestRadio )
{
  int i;
  for( i = 0; i < MAX_RADIO_BUTTON_LIST_LENGTH; i++ )
     DestRadio.List[i] = List[i];
  DestRadio.ListCount = ListCount;
}
//-------------------------------------------------------------------------------------
public void Add2DaisyChain( RadioButton NewRadio )
{
  int i;
  for( i = 0; i < MAX_RADIO_BUTTON_LIST_LENGTH; i++ )
    if( List[i] == null )
    {
      List[i] = NewRadio;
      ListCount++;
      break;
    }

  for( i = 0; i < ListCount; i++ )
    if( List[i] != null && List[i] != this )
        CopyDaisyChain( List[i] ); 
}
//-------------------------------------------------------------------------------------
protected void DrawPrimitive()
{
 GE.DrawCircle( X + Width/2, Y + Height/2, Width/2, PictureLayer, InnerColor, GE.G_STYLE_FILL ); 
 
 if( CheckedFlag )
     GE.DrawCircle( X + Width/2, Y + Height/2, Width/3, PictureLayer, OuterColor, GE.G_STYLE_FILL );
}
//-------------------------------------------------------------------------------------
protected void OnClickDo()
{
  int i;
  for( i = 0; i < ListCount; i++ )
    if( List[i] != null && List[i] != this )
        List[i].CheckedFlag = false;
  CheckedFlag = true;
}
//------------------------------------------------------------------------------------- 
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class MultiStateButton extends GameObject
{
/*
enhanced verision of the ordinary button
*/

protected int MaxStates;
protected int FontSize;
protected int[] StateInnerColor;
protected int[] StateOuterColor;
protected String[] CaptionList;
protected int[] StatePictureIndex;
protected int ButtonState;
protected int Width, Height;

public static final int STYLE_PRIMITIVE = 1;
public static final int STYLE_PICTURE = 2;
public int DrawStyle;

protected int TilePictureIndex;
protected int [] TilePictureIndex_TileX, TilePictureIndex_TileY;
protected int PictureWidthCells, PictureHeightCells;
protected int TileWidthPixels, TileHeightPixels;
protected int AlphaValue;

protected int DrawAltFlag = 0;

//-------------------------------------------------------------------------------------
public MultiStateButton( int nX, int nY, int nWidth, int nHeight, int nMaxStates, int nFontSize )
{
	  super();
	  ClassType[TYPE_MULTI_STATE_BUTTON] = 1;
	  Name = new String("Multistate Button");
	  X = nX; Y = nY; Width = nWidth; Height = nHeight;
	  ButtonState = 0;
	  MaxStates = nMaxStates;
	  MouseEventNotifyFlag = true;
	  
	  DrawStyle = STYLE_PICTURE; 
	  
	  if( nFontSize > 0 )
	     FontSize = nFontSize;
	  else
	     FontSize = 18;	
	  
	  TextLayer = GE.LAYER_2;
	  PictureLayer = GE.LAYER_1;	
	  
	  TilePictureIndex_TileX = TilePictureIndex_TileY = null;
}
//-------------------------------------------------------------------------------------
public MultiStateButton( int[] nStatePictureList, String[] sCaptionList, 
	     int[] nStateInnerColor, int[] nStateOuterColor,
	     int nX, int nY, int nWidth, int nHeight, int nMaxStates, int nFontSize )
	{
	  super();
	  ClassType[TYPE_MULTI_STATE_BUTTON] = 1;
	  Name = new String("Multistate Button");
	  X = nX; Y = nY; Width = nWidth; Height = nHeight;
	  ButtonState = 0;
	  MaxStates = nMaxStates;
	  MouseEventNotifyFlag = true;
	  
	  int i;
	  
	  if( nFontSize > 0 )
	     FontSize = nFontSize;
	  else
	     FontSize = 18;
	   
	  if( nStatePictureList != null )
	  {  
	     StatePictureIndex = new int[MaxStates];
	     
	     for( i = 0; i < MaxStates; i++ )
	          StatePictureIndex[i] = nStatePictureList[i];
	     
	     DrawStyle = STYLE_PICTURE;     
	           
	  }
	  if( sCaptionList != null )
	  {
	     CaptionList = new String[MaxStates];
	     
	     for( i = 0; i < MaxStates; i++ )
	        CaptionList[i] = new String(sCaptionList[i]);
	     
	     DrawStyle = STYLE_PRIMITIVE;    
	  } 
	  if( nStateInnerColor != null )
	  {
	     StateInnerColor = new int[nStateInnerColor.length];
	     StateOuterColor = new int[nStateOuterColor.length];
	     
	     for( i = 0; i < nStateInnerColor.length; i++ )
	     {
	       StateInnerColor[i] = nStateInnerColor[i];
	       StateOuterColor[i] = nStateOuterColor[i];  
	     }
	  }
	  else
	  {
	     StateInnerColor = new int[nMaxStates];
	     StateOuterColor = new int[nMaxStates];  
	     
	     for( i = 0; i < MaxStates; i++ )
	     {
	       StateInnerColor[i] = Color.rgb(100,100,100);
	       StateOuterColor[i] = Color.rgb(255, 0, 0);     
	     }
	  }
	  
	  TextLayer = GE.LAYER_2;
	  PictureLayer = GE.LAYER_1;
	  
	  TilePictureIndex_TileX = TilePictureIndex_TileY = null;
	}
	//-------------------------------------------------------------------------------------
    public void SetMaxStates( int nMaxStates )
    {    	
    	MaxStates = nMaxStates;	
    }
    //-------------------------------------------------------------------------------------
    public void SetButtonState( int nButtonState )
    {    	
      ButtonState = nButtonState;
    }
    //-------------------------------------------------------------------------------------    
	public int GetButtonState()
	{
	   return ButtonState;
	}
	//-------------------------------------------------------------------------------------
	protected boolean CheckClickWithin()
	{
	boolean returnvalue = false;

	if( X <= MouseX && MouseX < X + Width &&
	    Y <= MouseY && MouseY < Y + Height )
	    returnvalue = true;
	return returnvalue;    
	}
	//-------------------------------------------------------------------------------------	
	protected void DrawState()
	{
if( DrawAltFlag == 1 )
{
  GameGlobals.DrawTileImageOne( TilePictureIndex, (int)X, (int)Y, PictureLayer, AlphaValue, TilePictureIndex_TileX[ButtonState], 
		   TilePictureIndex_TileY[ButtonState], TileWidthPixels, TileHeightPixels );	
}
else
{
	if( DrawStyle == STYLE_PRIMITIVE )
	{
	  GE.DrawBox( X, Y, X+Width, Y+Height, PictureLayer, StateOuterColor[ButtonState], 
	    GameEngine.G_STYLE_FILL );
	  GE.DrawBox( X+2, Y+2, X+Width-2, Y+Height-2, PictureLayer, StateInnerColor[ButtonState],
	    GameEngine.G_STYLE_FILL );
	  GE.DrawTextColor( CaptionList[ButtonState],(int)X+5, (int)Y+Height-10, 
	    TextLayer, StateOuterColor[ButtonState], FontSize );
	}
	else
	if( DrawStyle == STYLE_PICTURE )
	{
	  if( TilePictureIndex_TileX != null )
	      GameGlobals.DrawTileImageGeneralUltra( TilePictureIndex, (int)X, (int)Y, PictureLayer, AlphaValue, 
	    		    TilePictureIndex_TileX[ButtonState], TilePictureIndex_TileY[ButtonState], 
	    	    	PictureWidthCells, PictureHeightCells, TileWidthPixels, TileHeightPixels );  		  
	  else
	     GE.DrawImage( StatePictureIndex[ButtonState], (int)X, (int)Y, PictureLayer );    
	}
}

	}
	//-------------------------------------------------------------------------------------
	public void Draw()
	{  
	  DrawState();
	}
	//-------------------------------------------------------------------------------------
	public void OnClick() 
	{
		int YesFlag = 0;
		
		if( (MouseStatus == ME_PRESS_DOWN || MouseStatus == ME_MOVE )  && CheckClickWithin() )
		{
			if( InputDelayMax > 0 )
			{
			  if( InputDelayCounter >= InputDelayMax )
			  {		
	            YesFlag = 1;
		        InputDelayCounter = 0;
			  }

			}
			else
				YesFlag = 1;

		   if( YesFlag == 1)
		   {
	        ButtonState++;
	        if( ButtonState > MaxStates - 1 )
	           ButtonState = 0;
	        OnClickDo();
	        CopyDupInput();		
		   }	  
		}
		else 
		if( MouseStatus == ME_RELEASE )
		{  
		    OnUnClickDo();	    
		}
	}
	//-------------------------------------------------------------------------------------
	public void InstantClick()
	{
	  ButtonState++;
	  if( ButtonState > MaxStates - 1 )
	      ButtonState = 0;
	}
	//-------------------------------------------------------------------------------------	
	protected void OnClickDo()
	{
	}
	//-------------------------------------------------------------------------------------
	protected void OnUnClickDo()
	{
	}
	//-------------------------------------------------------------------------------------
	public void Do()
	{
	  if( InputDelayCounter < InputDelayMax )
	      InputDelayCounter++;	
	}
	//-------------------------------------------------------------------------------------		
	public void SetTileStyle( int nTilePictureIndex, int[] nTilePictureIndex_TileX,
			 int[] nTilePictureIndex_TileY,  
			 int nPictureWidthCells, int nPictureHeightCells, int nTileWidthPixels,
			 int nTileHeightPixels, int nAlphaValue )
	{
	
	  int i;
	  
	  TilePictureIndex = nTilePictureIndex;
	  TilePictureIndex_TileX = new int[MaxStates];
	  TilePictureIndex_TileY = new int[MaxStates];
	  
	  for( i = 0; i < MaxStates; i++ )
	  {
		TilePictureIndex_TileX[i] = nTilePictureIndex_TileX[i];
		TilePictureIndex_TileY[i] = nTilePictureIndex_TileY[i];		
	  }
	  
	  PictureWidthCells = nPictureWidthCells;
	  PictureHeightCells = nPictureHeightCells;
	  TileWidthPixels = nTileWidthPixels;
	  TileHeightPixels = nTileHeightPixels;
	  AlphaValue = nAlphaValue;
	}
	//-------------------------------------------------------------------------------------	
public MultiStateButton( int nX, int nY, int nWidth, int nHeight, int nGroupId, int nUniqueId, int nPictureLayer, int nTextLayer,
        int nMaxStates, int nPictureIndex, int nRowStartIndex, int nAlphaValue )
{
   super();
   ClassType[TYPE_MULTI_STATE_BUTTON] = 1;
   Name = new String("Multistate Button");
   X = nX; Y = nY; Width = nWidth; Height = nHeight;
   ButtonState = 0;
   MaxStates = nMaxStates;
   MouseEventNotifyFlag = true;	  
   DrawStyle = STYLE_PICTURE; 

   Width = nWidth; Height = nHeight;
   X = nX; Y = nY; GroupId = nGroupId; UniqueId = nUniqueId;
   PictureLayer = nPictureLayer; TextLayer = nTextLayer;

   int i;
   int x = 0, y = nRowStartIndex;
   int[] TileX = new int[MaxStates];
   int[] TileY = new int[MaxStates];

   for( i = 0; i < MaxStates; i++ )
   {
      TileX[i] = x; TileY[i] = y + i;
   }
   
int ScaledWidth = (int)(GameControl.ImageScaleRelative_320x480[nPictureIndex] * Width);
int ScaledHeight = (int)(GameControl.ImageScaleRelative_320x480[nPictureIndex] * Height);   

   SetTileStyle( nPictureIndex, TileX, TileY, 1, 1, ScaledWidth, ScaledHeight, nAlphaValue );

   DrawAltFlag = 1;
}
//-------------------------------------------------------------------------------------	
	}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class SimpleBackGround extends GameObject
{

  public final static int STYLE_FILL_COLOR = 1;
  public final static int STYLE_PICTURE_TILED = 2;
  public final static int STYLE_PICTURE_CENTER = 3;
  public final static int BACKGROUND_TILE_WIDTH_PIXELS = 96;
  public final static int BACKGROUND_TILE_HEIGHT_PIXELS = 96;

  int Style;
  int FillColor;
  int PictureIndex;
  int PictureWidth, PictureHeight;

  protected int PictureIndex_TileX, PictureIndex_TileY;
  protected int PictureWidthCells, PictureHeightCells;
  protected int TileWidthPixels, TileHeightPixels;
  protected int AlphaValue;
  
//------------------------------------------------------------------------------------- 
public SimpleBackGround()
{
  super();
  ClassType[TYPE_SIMPLE_BACKGROUND] = 1;
  PictureLayer = GE.LAYER_0;
  TextLayer = GE.LAYER_1;
  FillColor = Color.BLUE;
  Style = STYLE_FILL_COLOR ;
  PictureIndex = GameControl.IMAGE_TILES_BACKGROUND;
  PictureIndex_TileX = PictureIndex_TileY = 0;
  
  SetTileStyle( GameControl.IMAGE_TILES_BACKGROUND, 0, 0, 1, 1, BACKGROUND_TILE_WIDTH_PIXELS, 
		  BACKGROUND_TILE_HEIGHT_PIXELS, 255 );
}
//-------------------------------------------------------------------------------------
public void SetProperties( int nStyle, int nFillColor, int nPictureIndex, 
        int nPictureWidth, int nPictureHeight )
{
  Style = nStyle; FillColor = nFillColor; PictureIndex = nPictureIndex; 
  PictureWidth = nPictureWidth; PictureHeight = nPictureHeight;
}                   
//-------------------------------------------------------------------------------------
public void Draw()
{
  int ix, iy;

  if( Style == STYLE_FILL_COLOR )
  {
     GE.DrawBox( 0, 0, ScreenWidth, ScreenHeight, PictureLayer, FillColor, 
	      GameEngine.G_STYLE_FILL );   
  }
  else
  if( Style == STYLE_PICTURE_TILED )
  { 
	if( PictureIndex_TileX > -1 )
	{
	 for( iy = 0; iy < ScreenHeight; iy += (PictureHeight-1) )
	   for( ix = 0; ix < ScreenWidth; ix += (PictureWidth-1) )		
	    GameGlobals.DrawTileImageOne( PictureIndex, ix, iy, PictureLayer, AlphaValue, 
	      PictureIndex_TileX, PictureIndex_TileY, TileWidthPixels, TileHeightPixels );  
	}
	else
	{
      for( iy = 0; iy < ScreenHeight; iy += (PictureHeight-1) )
       for( ix = 0; ix < ScreenWidth; ix += (PictureWidth-1) )
         GE.DrawImage( PictureIndex, ix, iy, PictureLayer );     
	}
  }
  else
  if( Style == STYLE_PICTURE_CENTER )
  {
    ix = ScreenWidth/2 - PictureWidth/2;
    iy = ScreenHeight/2 - PictureHeight/2;
    
    GE.DrawImage( PictureIndex, ix, iy, PictureLayer );  
  }
}
//-------------------------------------------------------------------------------------
public void SetTileStyle( int nPictureIndex, int nPictureIndex_TileX, int nPictureIndex_TileY, 
		 int nPictureWidthCells, int nPictureHeightCells, int nTileWidthPixels,
		 int nTileHeightPixels, int nAlphaValue )
{
PictureIndex =  nPictureIndex;  
PictureIndex_TileX =  nPictureIndex_TileX;
PictureIndex_TileY = nPictureIndex_TileY;
PictureWidthCells = nPictureWidthCells; 	 
PictureHeightCells = nPictureHeightCells;
TileWidthPixels = nTileWidthPixels;
TileHeightPixels =nTileHeightPixels;
AlphaValue = nAlphaValue;
}
//------------------------------------------------------------------------------------- 
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class MenuCursorParallelia extends GameObject
{  

public static int
  MENU_A = 0, MENU_B = 1, MENU_C = 2, MENU_C2 = 3, MENU_D = 4, MENU_D_SUB = 5, MENU_E = 6, MENU_F = 7, MENU_G = 8, MENU_H = 9;

int MenuIndex, TilePictureIndex, AlphaValue;
int[] Menu_PosX, Menu_PosY, MenuItemSize;

public static int PIXELS_16 = 16, PIXELS_32 = 32, PIXELS_64 = 64, PIXELS_128 = 128;
public static int PIXELS_48 = 48, PIXELS_96 = 96, PIXELS_144 = 144, PIXELS_192 = 192;
public static int CELLS_1 = 1, CELLS_2 = 2, CELLS_3 = 3, CELLS_4 = 4;
int MenuSelectionIndex, MaxMenuSelectionIndex;

public final static int CURSOR_48x48 = 1, CURSOR_96x48 = 2, CURSOR_144x48 = 3, CURSOR_192x48 = 4;
protected static int CursorWidthPixels, CursorHeightPixels;

//-------------------------------------------------------------------------------------   
public MenuCursorParallelia( int nMenuIndex )
	{
	  super();
	  ClassType[TYPE_MENU_CURSOR_PARALLELIA] = 1;
	  Name = new String("Menu Cursor Parallelia");
	  X = 0; Y = 0;
	  KeyEventNotifyFlag = true;
	  
      MenuIndex = nMenuIndex;	        	  	  
	  TextLayer = GE.LAYER_4;
	  PictureLayer = GE.LAYER_4;
      
      SetTileStyle();
	}   
	//------------------------------------------------------------------------------------- 
	protected void DrawState()
	{
       int i = MenuSelectionIndex, x_shift = 0;
       
       switch( MenuItemSize[i] )
       {
        case CURSOR_48x48:
           break;
        case CURSOR_96x48:
           x_shift = 96/2 - 48/2;
           break;
        case CURSOR_144x48:
           x_shift = 144/2 - 48/2;
           break;
        case CURSOR_192x48:
           x_shift = 192/2 - 48/2;
           break;
        default:
           break;
       }
       GameGlobals.DrawTileImageOne( TilePictureIndex, Menu_PosX[i] + x_shift, Menu_PosY[i], PictureLayer, AlphaValue, 
    		0, 0, CursorWidthPixels, CursorHeightPixels );
	    
	}
	//-------------------------------------------------------------------------------------
	public void Draw()
	{  
	  DrawState();
	}
	//-------------------------------------------------------------------------------------
    protected void HandleKeyDown()
    {
     int IndexChange = 0;
    
        switch( KeyCode )
        {
          case KeyEvent.KEYCODE_DPAD_DOWN:
            IndexChange++;
            break;
          case KeyEvent.KEYCODE_DPAD_LEFT:
            IndexChange--;
            break;
          case KeyEvent.KEYCODE_DPAD_RIGHT:
            IndexChange++;
            break;
          case KeyEvent.KEYCODE_DPAD_UP:
            IndexChange--;
            break;
          case KeyEvent.KEYCODE_BACK:
            break;
          case KeyEvent.KEYCODE_ENTER:
          case KeyEvent.KEYCODE_DPAD_CENTER:
            MouseX = Menu_PosX[MenuSelectionIndex] + PIXELS_16; 
            MouseY = Menu_PosY[MenuSelectionIndex] + PIXELS_16;
            MouseStatus = ME_PRESS_DOWN;
            GE.TheControlManager.DoClickEvent( MouseStatus, MouseX, MouseY );
            break;
          default:
            break;
        }

      if( InputDelayCounter >= InputDelayMax )
      {
         InputDelayCounter = 0;
         MenuSelectionIndex += IndexChange;
      }
 
      if( MenuSelectionIndex < 0 )
          MenuSelectionIndex = 0;   
      else
      if( MenuSelectionIndex > MaxMenuSelectionIndex )
          MenuSelectionIndex = MaxMenuSelectionIndex;
    }
    //-------------------------------------------------------------------------------------
    protected void HandleKeyUp()
    {
     int IndexChange = 0;
    
        switch( KeyCode )
        {
          case KeyEvent.KEYCODE_DPAD_DOWN:
          case KeyEvent.KEYCODE_DPAD_LEFT:
          case KeyEvent.KEYCODE_DPAD_RIGHT:
          case KeyEvent.KEYCODE_DPAD_UP:
            break;
          case KeyEvent.KEYCODE_BACK:
            break;
          case KeyEvent.KEYCODE_ENTER:
          case KeyEvent.KEYCODE_DPAD_CENTER:
            MouseX = Menu_PosX[MenuSelectionIndex] + PIXELS_16; 
            MouseY = Menu_PosY[MenuSelectionIndex] + PIXELS_16;
            MouseStatus = ME_RELEASE;
            GE.TheControlManager.DoClickEvent( MouseStatus, MouseX, MouseY );
            break;
          default:
            break;
        }

         InputDelayCounter = InputDelayMax;
    }
    //-------------------------------------------------------------------------------------    
	public void OnKey() 
	{ 
      if( KeyStatus == ME_KEY_DOWN )
         HandleKeyDown();
      else
      if( KeyStatus == ME_KEY_UP )
         HandleKeyUp();  
	}
	//-------------------------------------------------------------------------------------
	public void Do()
	{
	  if( InputDelayCounter < InputDelayMax )
	      InputDelayCounter++;	         
	}
	//-------------------------------------------------------------------------------------	
	protected void InitArrays( int length )
	{
        Menu_PosX = new int[length];
        Menu_PosY = new int[length];
        MenuItemSize = new int[length];
	}
	//-------------------------------------------------------------------------------------	
	protected void InitCursor( int Index, int PosX, int PosY, int nMenuItemSize )
	{
        Menu_PosX[Index] = PosX; Menu_PosY[Index] = PosY;
        MenuItemSize[Index] = nMenuItemSize;	
	}
	//-------------------------------------------------------------------------------------		
	protected void SetTileStyle()
	{
	  MenuSelectionIndex = 0;
      TilePictureIndex = GameControl.IMAGE_MENU_CURSOR;
      
      CursorWidthPixels = (int)(PIXELS_48 * GameControl.ImageScaleRelative_320x480[GameControl.IMAGE_MENU_CURSOR]);
      CursorHeightPixels =(int)(PIXELS_48 * GameControl.ImageScaleRelative_320x480[GameControl.IMAGE_MENU_CURSOR]);
 
      if( MenuIndex == MENU_A )
      {
        MaxMenuSelectionIndex = 3;
        InitArrays( MaxMenuSelectionIndex+1 );
        
        InitCursor( 0, 65,193, CURSOR_192x48);
        InitCursor( 1, 65,256, CURSOR_192x48);
        InitCursor( 2, 65,322, CURSOR_192x48); 
        InitCursor( 3, 65,322+66, CURSOR_192x48);  
      }
      else
      if( MenuIndex == MENU_B )
      {
        MaxMenuSelectionIndex = 2;
        InitArrays( MaxMenuSelectionIndex+1 );
        
        InitCursor( 0, 65,193,  CURSOR_192x48);
        InitCursor( 1, 65,256,  CURSOR_192x48);
        InitCursor( 2, 65,322,  CURSOR_192x48);          
      }
      else
      if( MenuIndex == MENU_C )
      {    	  
        MaxMenuSelectionIndex = 8;
        InitArrays( MaxMenuSelectionIndex+1 );
        
       InitCursor( 0, 212,81,  CURSOR_48x48);
       InitCursor( 1, 267,81, CURSOR_48x48);
       InitCursor( 2, 212,146, CURSOR_48x48);
       InitCursor( 3, 267,146,  CURSOR_48x48);
       InitCursor( 4, 238,211, CURSOR_48x48);
       InitCursor( 5, 238,275, CURSOR_48x48);

       InitCursor( 6, 214,342, CURSOR_48x48);
       InitCursor( 7, 267,342,  CURSOR_48x48);
       
       InitCursor( 8, 109,419,  CURSOR_96x48);   	  
      }
      else
      if( MenuIndex == MENU_D )
      {    	  
        MaxMenuSelectionIndex = 4;
        InitArrays( MaxMenuSelectionIndex+1 );  
        
        InitCursor( 0, 40,357,  CURSOR_48x48);
        InitCursor( 1, 100,357,  CURSOR_48x48);
        InitCursor( 2, 160,357, CURSOR_48x48);
        InitCursor( 3, 220,357, CURSOR_48x48);
        InitCursor( 4, 104,416, CURSOR_96x48);        
      }
      else
      if( MenuIndex == MENU_D_SUB )
      {    	  
        MaxMenuSelectionIndex = 0;
        InitArrays( MaxMenuSelectionIndex+1 ); 
        InitCursor( 0, 104,200,  CURSOR_96x48);
      }      
      else
      if( MenuIndex == MENU_E )
      {    	  
        MaxMenuSelectionIndex = 2;
        InitArrays( MaxMenuSelectionIndex+1 );   
        InitCursor( 0, 13,419,  CURSOR_48x48);
        InitCursor( 1, 109,419, CURSOR_96x48);
        InitCursor( 2, 253,419,  CURSOR_48x48);        
      }
      else
      if( MenuIndex == MENU_F )
      {    	  
      }
      else
      if( MenuIndex == MENU_G )
      {
        MaxMenuSelectionIndex = 0;
        InitArrays( MaxMenuSelectionIndex+1 ); 
        InitCursor( 0, 109,419,  CURSOR_96x48);    	  
      }
      else
      if( MenuIndex == MENU_H )
      {
        MaxMenuSelectionIndex = 2;
        InitArrays( MaxMenuSelectionIndex+1 );   
        InitCursor( 0, 109,419, CURSOR_96x48);
        InitCursor( 1, 109+96,419,  CURSOR_48x48);       
        InitCursor( 2, 109+96+48,419,  CURSOR_48x48);    	 
      }
      
      AlphaValue = 200;
	}
	//-------------------------------------------------------------------------------------	
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
class ControlManager
{
  protected GameObject[] ControlList;
  protected final static int CONTROL_LIST_LENGTH = 200;
  protected int i;
  
  MenuCursorParallelia ItsMenuCursorParallelia = null;
  
  GameGlobals gg;
  GameEngine GE;
  GameOptions gop;
  protected int CaptionDistanceBetweenLines = 15;
  
  int DoneLoadingFlag = 0;
  CaptionBox EulaCaptionBox = null;

//-------------------------------------------------------------------------------------
  public ControlManager()
  {
	ControlList = new GameObject[CONTROL_LIST_LENGTH];
	gg = new GameGlobals();
	gg.GE = GameEngine.CurrentObj;
	GE = GameEngine.CurrentObj;
	GameOptions.Load();
  }
//-------------------------------------------------------------------------------------  
  protected void AddControl( GameObject obj )
  {
    for( i = 0; i < CONTROL_LIST_LENGTH; i++ )
      if( ControlList[i] == null )
      {
          ControlList[i] = obj;
          break;
      }    
  }  
//-------------------------------------------------------------------------------------    
  // *** replaceable in descendant class ***
  public void CreateMenuA()
  {	  
	  //GemstonedActivity.ChangeAdPosition(0);
	  
	  Caption Caption1;
	  Button Button1;	  
	  Destroy(0, 0);
	  
	  int i, x, y;
	  
      Caption1 = new Caption( 19 + 50, 65 + gg.Y_SHIFT, gg.GROUP_ID_MENU_A, gg.UNIQUE_ID_CAPTION_GENERAL, Caption.STYLE_PICTURE, GE.LAYER_2, GE.LAYER_3 );
      Caption1.Init_2(  GameControl.IMAGE_MAIN_TITLE, 320, 480, 0, 255, 0 );
	  AddControl(Caption1);	
	  
	  for( i = 0; i < 5; i++ )
	  {
		x = 19 + GameGlobals.random( -SwapCellGrid.TILE_WIDTH_PIXELS, SwapCellGrid.TILE_WIDTH_PIXELS );
		y = 65 + i * GameGlobals.random( -SwapCellGrid.TILE_WIDTH_PIXELS, SwapCellGrid.TILE_WIDTH_PIXELS );
	    AddControl( new SwapCellDemoDisplay( x, y, 1 ) );
	  }
	  
	  Button1 = new Button( "Start", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 65, 193 + gg.Y_SHIFT, 192, 48, gg.GROUP_ID_MENU_A, gg.UNIQUE_ID_BUTTON_START, GE.LAYER_2, GE.LAYER_1, 
        GameControl.IMAGE_TILES_4x1, 0, 8, 255 );
      AddControl(Button1);

	  Button1 = new Button( "Continue", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 65, 193 + 63 * 1 + gg.Y_SHIFT, 192, 48, gg.GROUP_ID_MENU_A, gg.UNIQUE_ID_BUTTON_CONTINUE, GE.LAYER_2, GE.LAYER_1, 
        GameControl.IMAGE_TILES_4x1, 1, 8, 255 );
      AddControl(Button1);            
           
      Button1 = new Button( "Options", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 65, 193 + 63 * 2 + gg.Y_SHIFT, 192, 48, gg.GROUP_ID_MENU_A, gg.UNIQUE_ID_BUTTON_OPTIONS, GE.LAYER_2, GE.LAYER_1, 
        GameControl.IMAGE_TILES_4x1, 2, 8, 255 );
      AddControl(Button1);
	 
      Button1 = new Button( "High Scores", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 65, 193 + 63 * 3 + gg.Y_SHIFT, 192, 48, gg.GROUP_ID_MENU_A, gg.UNIQUE_ID_BUTTON_HIGH_SCORES, GE.LAYER_2, GE.LAYER_1, 
        GameControl.IMAGE_TILES_4x1, 3, 8, 255 );
      AddControl(Button1);

/*      
      Button1 = new Button( "About", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 65, 322+66, 192, 48, gg.GROUP_ID_MENU_A, gg.UNIQUE_ID_BUTTON_ABOUT_EULA, GE.LAYER_2, GE.LAYER_1, 
        GameControl.IMAGE_TILES_4x1, 6, 6, 255 );
      AddControl(Button1);
*/      	  
      //SetGameObjectImages();
      
      CopyRightCaption crc = new CopyRightCaption();
      AddControl(crc);
      
      GameOptions.Load();
      
      if( GameGlobals.TVModeFlag > 0 )
          ItsMenuCursorParallelia = new MenuCursorParallelia( MenuCursorParallelia.MENU_A );
  }
//-------------------------------------------------------------------------------------
  // *** replaceable in descendant class ***
  public void CreateMenuB()
  {	
	  Caption Caption1;
	  Button Button1;	  
	  Destroy(0, 0);
	  
	  int x, y, i;
	  
      Caption1 = new Caption( 19 + 50, 65 + gg.Y_SHIFT, gg.GROUP_ID_MENU_B, gg.UNIQUE_ID_CAPTION_GENERAL, Caption.STYLE_PICTURE, GE.LAYER_2, GE.LAYER_3 );
      Caption1.Init_2(  GameControl.IMAGE_MAIN_TITLE, 320, 480, 0, 255, 0 );
	  AddControl(Caption1);	
	  
	  for( i = 0; i < 5; i++ )
	  {
		x = 19 + GameGlobals.random( -SwapCellGrid.TILE_WIDTH_PIXELS, SwapCellGrid.TILE_WIDTH_PIXELS );
		y = 65 + i * GameGlobals.random( -SwapCellGrid.TILE_WIDTH_PIXELS, SwapCellGrid.TILE_WIDTH_PIXELS );
	    AddControl( new SwapCellDemoDisplay( x, y, 1 ) );
	  }
	  
      Button1 = new Button( "Normal", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 65, 193 + gg.Y_SHIFT, 192, 48, gg.GROUP_ID_MENU_B, gg.UNIQUE_ID_BUTTON_GAME_MODE_NORMAL, GE.LAYER_2, GE.LAYER_1, 
        GameControl.IMAGE_TILES_4x1, 4, 4, 255 );	  
      AddControl(Button1);
      
      Button1 = new Button( "Infinite", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 65, 193+63*1 + gg.Y_SHIFT, 192, 48, gg.GROUP_ID_MENU_B, gg.UNIQUE_ID_BUTTON_GAME_MODE_INFINITE, GE.LAYER_2, GE.LAYER_1, 
        GameControl.IMAGE_TILES_4x1, 5, 5, 255 );	            	  
      AddControl(Button1);
      
      Button1 = new Button( "Count Down", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 65, 193+63*2 + gg.Y_SHIFT, 192, 48, gg.GROUP_ID_MENU_B, gg.UNIQUE_ID_BUTTON_GAME_MODE_COUNTDOWN, GE.LAYER_2, GE.LAYER_1, 
        GameControl.IMAGE_TILES_4x1, 6, 6, 255 );	            	  
      AddControl(Button1);   
      
      Button1 = new Button( "Special", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 65, 193+63*3 + gg.Y_SHIFT, 192, 48, gg.GROUP_ID_MENU_B, gg.UNIQUE_ID_BUTTON_GAME_MODE_SPECIAL, GE.LAYER_2, GE.LAYER_1, 
        GameControl.IMAGE_TILES_4x1, 7, 7, 255 );	            	  
      AddControl(Button1);          
                       
      if( GameGlobals.TVModeFlag > 0 )
          ItsMenuCursorParallelia = new MenuCursorParallelia( MenuCursorParallelia.MENU_B );
  }
//-------------------------------------------------------------------------------------
  // *** replaceable in descendant class ***
  public void CreateMenuC()
  {	  
	  Caption Caption1;
	  Button Button1;	  
	  CheckBox CheckBox1;
	  MultiStateButton MultiStateButton1;
	  Destroy(0, 0);
	  	  
      Caption1 = new Caption( 63, 10, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_CAPTION_GENERAL, Caption.STYLE_TEXT, -1, -1 );
      Caption1.Init_1( "Options", 25, gop.MainFontColor, 49, 20, false, 15 ); 
	  AddControl(Caption1);	

	  Caption1 = new Caption( 20, 81 + 48/3 + gg.Y_SHIFT, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_CAPTION_OPTION_GRID_WIDTH, Caption.STYLE_TEXT, -1, -1 );
      Caption1.Init_1( "Grid Width " + gop.GridWidth, 20, gop.MainFontColor, 10, 20, false, 15 ); 
	  AddControl(Caption1);		
	  
      Caption1 = new Caption( 20, 81 + 67 + 48/3 + gg.Y_SHIFT, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_CAPTION_OPTION_GRID_HEIGHT, Caption.STYLE_TEXT, -1, -1 );
      Caption1.Init_1( "Grid Height " + gop.GridHeight, 20, gop.MainFontColor, 10, 20, false, 15 ); 
	  AddControl(Caption1);		    

      Caption1 = new Caption( 20, 148 + 67 + 48/3 + gg.Y_SHIFT, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_CAPTION_OPTION_GEM_TYPE_COUNT, Caption.STYLE_TEXT, -1, -1 );
      Caption1.Init_1( "Gem Count " + gop.GemTypeCount, 20, gop.MainFontColor, 10, 20, false, 15 ); 
	  AddControl(Caption1);			  

      Caption1 = new Caption( 20, 212 + 67 + 48/3 + gg.Y_SHIFT, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_CAPTION_GENERAL, Caption.STYLE_TEXT, -1, -1 );
      Caption1.Init_1( "Sounds", 20, gop.MainFontColor, 10, 20, false, 15 ); 
	  AddControl(Caption1);	  

      Caption1 = new Caption( 20, 277 + 67 + gg.Y_SHIFT, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_CAPTION_GENERAL, Caption.STYLE_TEXT, -1, -1 );
      Caption1.Init_1( "Graphics Choice", 20, gop.MainFontColor, 10, 20, false, 15 ); 
	  AddControl(Caption1);	  	    

      Button1 = new Button( "+", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 212, 81 + gg.Y_SHIFT, 48, 48, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_BUTTON_OPTION_INC_GRID_WIDTH, GE.LAYER_2, GE.LAYER_1, 
      GameControl.IMAGE_TILES_1x1, 16, 16, 255 );	  
      AddControl(Button1);      
      
      Button1 = new Button( "-", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 267, 81 + gg.Y_SHIFT, 48, 48, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_BUTTON_OPTION_DEC_GRID_WIDTH, GE.LAYER_2, GE.LAYER_1, 
      GameControl.IMAGE_TILES_1x1, 17, 17, 255 );	  
      AddControl(Button1);    
      
      Button1 = new Button( "+", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 212, 81 + 67 + gg.Y_SHIFT, 48, 48, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_BUTTON_OPTION_INC_GRID_HEIGHT, GE.LAYER_2, GE.LAYER_1, 
      GameControl.IMAGE_TILES_1x1, 16, 16, 255 );	  
      AddControl(Button1);      
      
      Button1 = new Button( "-", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 267, 81 + 67 + gg.Y_SHIFT, 48, 48, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_BUTTON_OPTION_DEC_GRID_HEIGHT, GE.LAYER_2, GE.LAYER_1, 
      GameControl.IMAGE_TILES_1x1, 17, 17, 255 );	  
      AddControl(Button1);    
    
      Button1 = new Button( "+", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 212, 81+63*1 + 67 + gg.Y_SHIFT, 48, 48, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_BUTTON_OPTION_INC_GEM_TYPE_COUNT, 
			  GE.LAYER_2, GE.LAYER_1, 
      GameControl.IMAGE_TILES_1x1, 16, 16, 255 );	  
      AddControl(Button1);    
    
      Button1 = new Button( "-", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 267, 81+63*1 + 67 + gg.Y_SHIFT, 48, 48, gg.GROUP_ID_MENU_C,gg.UNIQUE_ID_BUTTON_OPTION_DEC_GEM_TYPE_COUNT, 
			  GE.LAYER_2, GE.LAYER_1, 
      GameControl.IMAGE_TILES_1x1, 17, 17, 255 );	  
      AddControl(Button1);           
      
    CheckBox1 = new CheckBox( 238, 81+63*2 + 67 + gg.Y_SHIFT, 48, 48, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_CHECKBOX_OPTION_SOUNDS, GE.LAYER_2, 
      GameControl.IMAGE_TILES_1x1, 19, 18, 255, false );
    
          Button1 = new Button( "Okay", 0,0,0,0 );
	  Button1.Create_WidthxHeight( 109, 419 + gg.Y_SHIFT, 96, 48, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_BUTTON_OPTION_OKAY, GE.LAYER_2, GE.LAYER_1, 
      GameControl.IMAGE_TILES_2x1, 0, 0, 255 );	  
      AddControl(Button1);    
 
	  if( gop.SoundsFlag > 0 )
		  CheckBox1.CheckedFlag = true;
	  else
		  CheckBox1.CheckedFlag = false;	  
	  AddControl(CheckBox1);
	    

    MultiStateButton1 = new MultiStateButton( 214,81+63*3 + 67 + gg.Y_SHIFT,  48,48, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_MULTISTATE_BUTTON_OPTION_BACKGROUND_1,
            GE.LAYER_2, GE.LAYER_1, 10, GameControl.IMAGE_TILES_1x1, 0, 255); 
    MultiStateButton1.ButtonState = gop.BackGroundIndex;
    AddControl(MultiStateButton1);
    MultiStateButton1 = new MultiStateButton( 267,81+63*3 + 67 + gg.Y_SHIFT,  48,48, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_MULTISTATE_BUTTON_OPTION_GEM_STYLE_INDEX,
            GE.LAYER_2, GE.LAYER_1, 10, GameControl.IMAGE_TILES_1x1, 0, 255); 	
     MultiStateButton1.ButtonState = gop.GemStyleIndex;
	AddControl(MultiStateButton1);

/*	
	  Button1 = new Button(">>", 253, 419, 48, 48);
	  AddButton( 253, 419, 48, 48, gg.GROUP_ID_MENU_C, gg.UNIQUE_ID_BUTTON_OPTION_RIGHT, 24 );

	  BlockCell DemoBlockCell = new BlockCell();
	  DemoBlockCell.X_pos = 30; DemoBlockCell.Y_pos = 381;
	  AddControl(DemoBlockCell);
*/
	 SwapCellDemoDisplay scdd = new SwapCellDemoDisplay( 30, 381 + gg.Y_SHIFT, 0 );
	 scdd.UniqueId = GameGlobals.UNIQUE_ID_TYPE_SWAP_CELL_DEMO_DISPLAY_1;
	 AddControl(scdd);
	 
	  if( GameGlobals.TVModeFlag > 0 )
	      ItsMenuCursorParallelia = new MenuCursorParallelia( MenuCursorParallelia.MENU_C );
	  	  
  }
//-------------------------------------------------------------------------------------
  // *** replaceable in descendant class ***  
  public void CreateMenuD()
  {
	  Caption Caption1;
	  Button Button1;	  
	  Destroy(0, 0);
	  
      Caption1 = new Caption( 20, 60, gg.GROUP_ID_MENU_D, gg.UNIQUE_ID_CAPTION_GENERAL, Caption.STYLE_TEXT, -1, -1 );
      Caption1.Init_1( "Game Over", 30, gop.MainFontColor, 40, 60, false, 15 ); 
	  AddControl(Caption1);
/*	  
	  if( HighScores.CurrentObj.CheckNewHighScore( GameOptions.CurrentGameType, GameOptions.CurrentPlayerScore ) >= 1 ) 
	  {		  
*/		        
      Caption1 = new Caption( 40, 140, gg.GROUP_ID_MENU_D, gg.UNIQUE_ID_CAPTION_GENERAL, Caption.STYLE_TEXT, -1, -1 );
      Caption1.Init_1( "New High Score!\n" + gop.CurrentPlayerScore, 25, gop.MainFontColor, 10, 40, true, 45 ); 
	  AddControl(Caption1);			    

      //GameOptions.CurrentPlayerName = "------------";      	    
      Caption1 = new Caption( 40, 300 + gg.Y_SHIFT, gg.GROUP_ID_MENU_D, gg.UNIQUE_ID_CAPTION_GAME_OVER_NAME, Caption.STYLE_TEXT, -1, -1 );
      Caption1.Init_1( GameOptions.CurrentPlayerName, 25, gop.MainFontColor, 10, 40, false, 15 ); 
      Caption1.DrawCursorFlag = true;
	  AddControl(Caption1);		    

       Button1 = new Button("<", 0,0,0,0);
       Button1.Create_WidthxHeight( 40, 357 + gg.Y_SHIFT, 48, 48, gg.GROUP_ID_MENU_D, gg.UNIQUE_ID_BUTTON_GAME_OVER_LEFT, GE.LAYER_1, GE.LAYER_2 , 
       GameControl.IMAGE_TILES_1x1, 12, 12, 255 );		
	   Button1.InputDelayMax = 5;	  
       AddControl(Button1);     

       Button1 = new Button("^", 0,0,0,0);
       Button1.Create_WidthxHeight( 100, 357 + gg.Y_SHIFT, 48, 48, gg.GROUP_ID_MENU_D, gg.UNIQUE_ID_BUTTON_GAME_OVER_UP, GE.LAYER_1, GE.LAYER_2 , 
       GameControl.IMAGE_TILES_1x1, 11, 11, 255 );	  
	   Button1.InputDelayMax = 5;	  
       AddControl(Button1);

       Button1 = new Button("\\/", 0,0,0,0);
       Button1.Create_WidthxHeight( 160, 357 + gg.Y_SHIFT, 48, 48, gg.GROUP_ID_MENU_D, gg.UNIQUE_ID_BUTTON_GAME_OVER_DOWN, GE.LAYER_1, GE.LAYER_2 , 
       GameControl.IMAGE_TILES_1x1, 10, 10, 255 );	    
		  Button1.InputDelayMax = 5;	
        AddControl(Button1);
        
       Button1 = new Button(">", 0,0,0,0);
       Button1.Create_WidthxHeight( 220, 357 + gg.Y_SHIFT, 48, 48, gg.GROUP_ID_MENU_D, gg.UNIQUE_ID_BUTTON_GAME_OVER_RIGHT, GE.LAYER_1, GE.LAYER_2 , 
       GameControl.IMAGE_TILES_1x1, 13, 13, 255 );		
		  Button1.InputDelayMax = 5;	
        AddControl(Button1);    
        
       Button1 = new Button("Okay", 0,0,0,0);
       Button1.Create_WidthxHeight( 104, 416 + gg.Y_SHIFT, 96, 48, gg.GROUP_ID_MENU_D, gg.UNIQUE_ID_BUTTON_GAME_OVER_OKAY_ADD_SCORE, GE.LAYER_1, GE.LAYER_2 , 
       GameControl.IMAGE_TILES_2x1, 0, 0, 255 );	 		    
        AddControl(Button1);            
        
	  if( GameGlobals.TVModeFlag > 0 )
	      ItsMenuCursorParallelia = new MenuCursorParallelia( MenuCursorParallelia.MENU_D );       
/*	  
	  }
	  else
	  {		
		  
       Button1 = new Button("Okay", 0,0,0,0);
       Button1.Create_WidthxHeight( 104, 200, 96, 48, gg.GROUP_ID_MENU_D, gg.UNIQUE_ID_BUTTON_GAME_OVER_OKAY, GE.LAYER_1, GE.LAYER_2 , 
       GameControl.IMAGE_TILES_2x1, 0, 0, 255 );	    
       AddControl(Button1);           
        
	  if( GameGlobals.TVModeFlag > 0 )
	      ItsMenuCursorParallelia = new MenuCursorParallelia( MenuCursorParallelia.MENU_D_SUB );        
	  }
*/	  
  }
//-------------------------------------------------------------------------------------  
  // *** replaceable in descendant class ***
  public void CreateMenuE()
  {
	  Caption Caption1;
	  Button Button1;	  
	  Destroy(0, 0);
	  
      Caption1 = new Caption( 63, 10, gg.GROUP_ID_MENU_E, gg.UNIQUE_ID_CAPTION_GENERAL, Caption.STYLE_TEXT, -1, -1 );
      Caption1.Init_1( "High Scores", 25, gop.MainFontColor, 5, 20, false, 15 ); 
	  AddControl(Caption1);		  

      Caption1 = new Caption( 63, 70 + gg.Y_SHIFT/2, gg.GROUP_ID_MENU_E, gg.UNIQUE_ID_CAPTION_HIGH_SCORES_LIST, Caption.STYLE_TEXT, -1, -1 );
      Caption1.Init_1( "", 20, gop.MainFontColor, 5, 10, true, 30 ); 
      //Caption1.SetText( gg.SelectHighScoreBoardtoString(0) );
      Caption1.SetText( HighScores.CurrentObj.CurrentList2String() );
	  AddControl(Caption1);		 

      Button1 = new Button("Okay", 0,0,0,0);
      Button1.Create_WidthxHeight( 109, 419 + gg.Y_SHIFT, 96, 48, gg.GROUP_ID_MENU_E, gg.UNIQUE_ID_BUTTON_HIGH_SCORES_OKAY, GE.LAYER_1, GE.LAYER_2 , 
      GameControl.IMAGE_TILES_2x1, 0, 0, 255 );	    
      AddControl(Button1);

       Button1 = new Button("<<", 0,0,0,0);
       Button1.Create_WidthxHeight( 13, 419 + gg.Y_SHIFT, 48, 48, gg.GROUP_ID_MENU_E, gg.UNIQUE_ID_BUTTON_HIGH_SCORES_LEFT, GE.LAYER_1, GE.LAYER_2 , 
       GameControl.IMAGE_TILES_1x1, 12, 12, 255 );	    
       AddControl(Button1);   	       

       Button1 = new Button(">>", 0,0,0,0);
       Button1.Create_WidthxHeight( 253, 419 + gg.Y_SHIFT, 48, 48, gg.GROUP_ID_MENU_E, gg.UNIQUE_ID_BUTTON_HIGH_SCORES_RIGHT, GE.LAYER_1, GE.LAYER_2 , 
       GameControl.IMAGE_TILES_1x1, 13, 13, 255 );	    
       AddControl(Button1);   	   

	  if( GameGlobals.TVModeFlag > 0 )
	      ItsMenuCursorParallelia = new MenuCursorParallelia( MenuCursorParallelia.MENU_E );      
	      
 }
//-------------------------------------------------------------------------------------  
// *** replaceable in descendant class ***
  public void CreateMenuF( int option )
  {	  	  
	  SwapCellGridController scgc = new SwapCellGridController();
	  scgc.GroupId = gg.GROUP_ID_MENU_F;

	  if( option == 1 )
	  {		
		if( scgc.DoFile(scgc.LOAD_FILE) == 0 )
			return;
	  }
	  
	  Destroy(0, 0);
	  AddControl(scgc);
	  
	  ItsMenuCursorParallelia = null;
  }
//------------------------------------------------------------------------------------- 
// *** replaceable in descendant class ***
  public void CreateMenuG()
  {
	 Caption Caption1;
	 Button Button1;	  
	 Destroy(0, 0);
	 
       Button1 = new Button("Okay", 0,0,0,0);
       Button1.Create_WidthxHeight( 109, 419, 96, 48, gg.GROUP_ID_MENU_G, gg.UNIQUE_ID_BUTTON_ABOUT_OKAY, GE.LAYER_2, GE.LAYER_3 , 
       GameControl.IMAGE_TILES_2x1, 0, 0, 255 );	    
       AddControl(Button1);   	    
/*	 
      Caption1 = new Caption( 0, 0, gg.GROUP_ID_MENU_G, gg.UNIQUE_ID_CAPTION_GENERAL, Caption.STYLE_PICTURE, -1, -1 );
      Caption1.Init_2(  GameControl.IMAGE_ABOUT, 320, 480, 0, 255, 0 );
	  AddControl(Caption1);		      
*/      
	 if( GameGlobals.TVModeFlag > 0 )
	     ItsMenuCursorParallelia = new MenuCursorParallelia( MenuCursorParallelia.MENU_G );  	  	  
  }
//-------------------------------------------------------------------------------------   
public void CreateMenuH()
{
   CaptionBox cb;
   Button Button1;	  
   Destroy(0, 0);	
   
   cb = new CaptionBox( 15, Color.rgb(200,200,200), 24,50, 270, 349, Color.rgb(0,0,0) );

   Button1 = new Button( "eula okay", 0,0,0,0 );
   Button1.Create_WidthxHeight( 109, 419, 96, 48, gg.GROUP_ID_MENU_H, gg.UNIQUE_ID_BUTTON_ABOUT_EULA_OKAY, GE.LAYER_2, GE.LAYER_1, 
      GameControl.IMAGE_TILES_2x1, 0, 0, 255 ); 
   AddControl(Button1);
   
   Button1 = new Button( "eula up", 0,0,0,0 );
   Button1.Create_WidthxHeight( 109+96, 419, 48, 48, gg.GROUP_ID_MENU_H, gg.UNIQUE_ID_BUTTON_ABOUT_EULA_UP, GE.LAYER_2, GE.LAYER_1, 
      GameControl.IMAGE_TILES_1x1, 11, 11, 255 ); 
   AddControl(Button1);
   
   Button1 = new Button( "eula down", 0,0,0,0 );
   Button1.Create_WidthxHeight( 109+96+48, 419, 48, 48, gg.GROUP_ID_MENU_H, gg.UNIQUE_ID_BUTTON_ABOUT_EULA_DOWN, GE.LAYER_2, GE.LAYER_1, 
      GameControl.IMAGE_TILES_1x1, 10, 10, 255 ); 
   AddControl(Button1);   
      
   GE.FileName =  "raw:"+R.raw.eula;	        	      
   GameEngine.CurrentObj.DoRequest(GameEngine.CurrentObj.G_REQUEST_READ_FILE);
   
   cb.SetText( GE.FileDataStr );   
   AddControl( cb );   
   
   EulaCaptionBox = cb;
    
   if( GameGlobals.TVModeFlag > 0 )
	   ItsMenuCursorParallelia = new MenuCursorParallelia( MenuCursorParallelia.MENU_H );   	
}
//------------------------------------------------------------------------------------- 
public void CreateMenuI()
{
   CustomDrawText cdt;
   Button Button1;	  
   Destroy(0, 0);	
   
   cdt = new CustomDrawText( 0, 0, GameControl.IMAGE_FONT_LM_18x27, 18, 27 );   
   cdt.SetText("Save game?");
   cdt.X = GameEngine.TARGET_SCREEN_WIDTH/2 - cdt.GetStringWidthPixels()/2; 
   cdt.Y = GameEngine.TARGET_SCREEN_HEIGHT/5;
   cdt.GroupId = gg.GROUP_ID_MENU_I;
   AddControl(cdt);
   
   int x, y;
   
   x = GameEngine.TARGET_SCREEN_WIDTH/4 - 48/2;
   y = GameEngine.TARGET_SCREEN_HEIGHT/2 - 48/2;
   Button1 = new Button( "O", 0,0,0,0 );
   Button1.Create_WidthxHeight( x, y, 48, 48, gg.GROUP_ID_MENU_I, gg.UNIQUE_ID_BUTTON_MENUI_O, GE.LAYER_2, GE.LAYER_1, 
      GameControl.IMAGE_TILES_1x1, 20, 20, 255 ); 
   AddControl(Button1);    
   
   x = GameEngine.TARGET_SCREEN_WIDTH/4*3 - 48/2;
   y = GameEngine.TARGET_SCREEN_HEIGHT/2 - 48/2;
   Button1 = new Button( "X", 0,0,0,0 );
   Button1.Create_WidthxHeight( x, y, 48, 48, gg.GROUP_ID_MENU_I, gg.UNIQUE_ID_BUTTON_MENUI_X, GE.LAYER_2, GE.LAYER_1, 
      GameControl.IMAGE_TILES_1x1, 21, 21, 255 ); 
   AddControl(Button1);   
}
//------------------------------------------------------------------------------------- 
// *** replaceable in descendant class ***
  public void Init() 
  { 
	 CreateMenuA();
	 
      GameGlobals.BackDrop = new SimpleBackGround();

      GameGlobals.BackDrop.SetProperties( SimpleBackGround.STYLE_PICTURE_CENTER, Color.rgb(0,100,0), GameControl.BACKGROUND_330x490_0, 
        GameEngine.TARGET_SCREEN_WIDTH, GameEngine.TARGET_SCREEN_HEIGHT );	 
      
     GameGlobals.ChangeBackGround(); 
     gop.Load();
  }
//-------------------------------------------------------------------------------------  
  public void DoClickEvent( int TouchAction, int TouchX, int TouchY ) 
  {    
    GameObject.MouseStatus = TouchAction;
    GameObject.MouseX = TouchX;
    GameObject.MouseY = TouchY;

    for( i = 0; i < CONTROL_LIST_LENGTH; i++ ) 
      if( ControlList[i] != null )
       if( ControlList[i].MouseEventNotifyFlag )      
    	  ControlList[i].OnClick();  
  }
//-------------------------------------------------------------------------------------  
  public void DoKeyEvent( int KeyAction, int KeyCode )  
  {
    GameObject.KeyStatus = KeyAction;
    GameObject.KeyCode = KeyCode;
    
    if( ItsMenuCursorParallelia != null )
        ItsMenuCursorParallelia.OnKey();
         
    for( i = 0; i < CONTROL_LIST_LENGTH; i++ ) 
      if( ControlList[i] != null )
       if( ControlList[i].KeyEventNotifyFlag )      
    	  ControlList[i].OnKey();     
    

  }  
//-------------------------------------------------------------------------------------
  protected GameObject FindFirstControlById( int UniqueId )
  {	
	GameObject obj = null;
	
	for( i = 0; i < CONTROL_LIST_LENGTH; i++ )
	  if( ControlList[i] != null )
	   if( ControlList[i].UniqueId == UniqueId )
	   {
		  obj = ControlList[i];
		  break;
	   }
	
	return obj;
  }
//-------------------------------------------------------------------------------------  
// *** replaceable in descendant class ***
  protected void CheckControlListState() 
  {
    int UniqueId, GroupId;
    GameObject go;
    Caption cap;
    MultiStateButton msb;
        
    for( i = 0; i < CONTROL_LIST_LENGTH; i++ )
     if( ControlList[i] != null )
     {  
       go = ControlList[i];
       UniqueId = go.UniqueId;
       GroupId = go.GroupId;
       
       if( go.MouseStatus_Dup == go.ME_PRESS_DOWN ||
    	   go.MouseStatus_Dup == go.ME_MOVE )
       {
    	switch( UniqueId )
    	{
    	  //---------------------------------------------------------------------
    	case GameGlobals.UNIQUE_ID_BUTTON_START:    		 
              CreateMenuB();
            break;
          //---------------------------------------------------------------------
    	case GameGlobals.UNIQUE_ID_BUTTON_CONTINUE:
            CreateMenuF(1);    		
            break;
          //---------------------------------------------------------------------              
    	case GameGlobals.UNIQUE_ID_BUTTON_OPTIONS:
        	CreateMenuC();
            break; 
          //---------------------------------------------------------------------        
    	case GameGlobals.UNIQUE_ID_BUTTON_HIGH_SCORES:     	
        	CreateMenuE();
            break;
          //---------------------------------------------------------------------  
        case GameGlobals.UNIQUE_ID_BUTTON_ABOUT:
        	CreateMenuG();
        	break;
          //--------------------------------------------------------------------- 
        case GameGlobals.UNIQUE_ID_BUTTON_ABOUT_EULA:
        	CreateMenuH();
        	break;
          //---------------------------------------------------------------------         	
        case GameGlobals.UNIQUE_ID_BUTTON_ABOUT_OKAY:
        case GameGlobals.UNIQUE_ID_BUTTON_ABOUT_EULA_OKAY:         	
        	CreateMenuA();
        	break;       	
          //---------------------------------------------------------------------  
    	case GameGlobals.UNIQUE_ID_BUTTON_OPTION_INC_GRID_WIDTH:

        	gop.GridWidth++;        	
        	if( gop.GridWidth > gop.MAX_GRID_WIDTH )
        		gop.GridWidth = gop.MAX_GRID_WIDTH;   

        	cap = (Caption)FindFirstControlById(gg.UNIQUE_ID_CAPTION_OPTION_GRID_WIDTH);
        	cap.SetText( "Grid Width " + gop.GridWidth );        	
        	
        	break;
        	//---------------------------------------------------------------------        	
    	case GameGlobals.UNIQUE_ID_BUTTON_OPTION_DEC_GRID_WIDTH:
      
        	gop.GridWidth--;        	
        	if( gop.GridWidth < gop.MIN_GRID_WIDTH )
        		gop.GridWidth = gop.MIN_GRID_WIDTH; 
        	
        	cap = (Caption)FindFirstControlById(gg.UNIQUE_ID_CAPTION_OPTION_GRID_WIDTH);
        	cap.SetText( "Grid Width " + gop.GridWidth );

        	break;
        	//---------------------------------------------------------------------           	
    	case GameGlobals.UNIQUE_ID_BUTTON_OPTION_INC_GRID_HEIGHT:

        	gop.GridHeight++;        	
        	if( gop.GridHeight > gop.MAX_GRID_HEIGHT )
        		gop.GridHeight = gop.MAX_GRID_HEIGHT;   

        	cap = (Caption)FindFirstControlById(gg.UNIQUE_ID_CAPTION_OPTION_GRID_HEIGHT);
        	cap.SetText( "Grid Height " + gop.GridHeight );        	
        	
        	break;
        	//---------------------------------------------------------------------        	
    	case GameGlobals.UNIQUE_ID_BUTTON_OPTION_DEC_GRID_HEIGHT:
      
        	gop.GridHeight--;        	
        	if( gop.GridHeight < gop.MIN_GRID_HEIGHT )
        		gop.GridHeight = gop.MIN_GRID_HEIGHT; 
        	
        	cap = (Caption)FindFirstControlById(gg.UNIQUE_ID_CAPTION_OPTION_GRID_HEIGHT);
        	cap.SetText( "Grid Height " + gop.GridHeight );

        	break;
        	//---------------------------------------------------------------------        	
    	case GameGlobals.UNIQUE_ID_BUTTON_OPTION_INC_GEM_TYPE_COUNT:

        	gop.GemTypeCount++;        	
        	if( gop.GemTypeCount > gop.MAX_GEM_TYPE_COUNT )
        		gop.GemTypeCount = gop.MAX_GEM_TYPE_COUNT;  

        	cap = (Caption)FindFirstControlById(gg.UNIQUE_ID_CAPTION_OPTION_GEM_TYPE_COUNT);
        	cap.SetText( "Gem Count " + gop.GemTypeCount );        	

    	   break;
    	  //---------------------------------------------------------------------    	   
    	case GameGlobals.UNIQUE_ID_BUTTON_OPTION_DEC_GEM_TYPE_COUNT:

        	gop.GemTypeCount--;        	
        	if( gop.GemTypeCount < gop.MIN_GEM_TYPE_COUNT )
        		gop.GemTypeCount = gop.MIN_GEM_TYPE_COUNT;

        	cap = (Caption)FindFirstControlById(gg.UNIQUE_ID_CAPTION_OPTION_GEM_TYPE_COUNT);
        	cap.SetText( "Gem Count " + gop.GemTypeCount );          	

            break;
          //---------------------------------------------------------------------            
    	case GameGlobals.UNIQUE_ID_CHECKBOX_OPTION_SOUNDS:    		

           if( ((CheckBox)go).CheckedFlag )
        	   gop.SoundsFlag = 1;
           else
        	   gop.SoundsFlag = 0;

           break;
         //---------------------------------------------------------------------                   
    	case GameGlobals.UNIQUE_ID_MULTISTATE_BUTTON_OPTION_BACKGROUND_1:
    	       		    		
           gop.BackGroundIndex = ((MultiStateButton)go).ButtonState;
           gg.ChangeBackGround();
           
           break;           
         //---------------------------------------------------------------------            
    	case GameGlobals.UNIQUE_ID_MULTISTATE_BUTTON_OPTION_GEM_STYLE_INDEX:
           gop.GemStyleIndex = ((MultiStateButton)go).ButtonState;     
           SwapCellDemoDisplay scdd = (SwapCellDemoDisplay)FindFirstControlById(gg.UNIQUE_ID_TYPE_SWAP_CELL_DEMO_DISPLAY_1);
           scdd.Update();
           //BlockCell.ChangeRow(gg.CellLookIndex); 
           break;
         //---------------------------------------------------------------------           
    	case GameGlobals.UNIQUE_ID_BUTTON_OPTION_OKAY:
    		SwapCellGrid.ClearFile();
    		GameOptions.Save();

    	case GameGlobals.UNIQUE_ID_BUTTON_HIGH_SCORES_OKAY:
    		
        	CreateMenuA();
        	
           break;
         //---------------------------------------------------------------------           
    	case GameGlobals.UNIQUE_ID_BUTTON_HIGH_SCORES_LEFT:

        	cap = (Caption)FindFirstControlById(gg.UNIQUE_ID_CAPTION_HIGH_SCORES_LIST);
        	//cap.SetText( gg.SelectHighScoreBoardtoString(-1) );   
        	
        	HighScores.CurrentObj.ChangeListTypeIndex(-1);
            cap.SetText( HighScores.CurrentObj.CurrentList2String() );
            
           break;
         //---------------------------------------------------------------------           
    	case GameGlobals.UNIQUE_ID_BUTTON_HIGH_SCORES_RIGHT:

        	cap = (Caption)FindFirstControlById(gg.UNIQUE_ID_CAPTION_HIGH_SCORES_LIST);
        	//cap.SetText( gg.SelectHighScoreBoardtoString(1) );        
        	
        	HighScores.CurrentObj.ChangeListTypeIndex(1);
            cap.SetText( HighScores.CurrentObj.CurrentList2String() );
            
           break;
         //---------------------------------------------------------------------           
    	case GameGlobals.UNIQUE_ID_BUTTON_GAME_MODE_NORMAL:
    	   gop.Load();
     	   gop.CurrentGameType = gop.GAME_NORMAL;
           CreateMenuF(0);           
           break;    		
         //---------------------------------------------------------------------              
    	case GameGlobals.UNIQUE_ID_BUTTON_GAME_MODE_INFINITE:	
    	   gop.Load();	
     	   gop.CurrentGameType = gop.GAME_INFINITE;
           CreateMenuF(0);
           break;   
         //---------------------------------------------------------------------              
    	case GameGlobals.UNIQUE_ID_BUTTON_GAME_MODE_COUNTDOWN: 
    	   gop.Load();	
    	   gop.CurrentGameType = gop.GAME_COUNT_DOWN;
           CreateMenuF(0);
           break;
         //---------------------------------------------------------------------
    	case GameGlobals.UNIQUE_ID_BUTTON_GAME_MODE_SPECIAL:
    	   gop.Load();	
    	   gop.CurrentGameType = gop.GAME_SPECIAL;    	   
           CreateMenuF(0);    		
           break;
    	case GameGlobals.UNIQUE_ID_BUTTON_GAME_OVER_OKAY:
    	   SwapCellGrid.ClearFile();
           CreateMenuA();
           break;
         //---------------------------------------------------------------------           
    	case GameGlobals.UNIQUE_ID_BUTTON_GAME_OVER_OKAY_ADD_SCORE:
    	
    	   //GameGlobals.Add2HighScore( GameGlobals.CurrentPlayerName );
    	   //GameGlobals.SaveOptionsData();
    		
    	   HighScores.CurrentObj.Add2HighScore( GameOptions.CurrentGameType, GameOptions.CurrentPlayerName, 
    			GameOptions.CurrentPlayerScore );
    	   HighScores.CurrentObj.SaveHighScores();
           CreateMenuA();           
           break;    
         //---------------------------------------------------------------------
    	case GameGlobals.UNIQUE_ID_BUTTON_GAME_OVER_LEFT:  
    	   GameOptions.EditCurrentPlayerName( -1, 0 );
       	   cap = (Caption)FindFirstControlById(gg.UNIQUE_ID_CAPTION_GAME_OVER_NAME);
           cap.SetText( GameOptions.CurrentPlayerName );      
           cap.CursorCharPosition = GameOptions.CurrentPlayerNameCursorPosition;
    	   break;
         //---------------------------------------------------------------------      	   
    	case GameGlobals.UNIQUE_ID_BUTTON_GAME_OVER_DOWN: 
    		GameOptions.EditCurrentPlayerName( 0, 1 );
        	cap = (Caption)FindFirstControlById(gg.UNIQUE_ID_CAPTION_GAME_OVER_NAME);
            cap.SetText(GameOptions.CurrentPlayerName );     		
    	   break;
         //---------------------------------------------------------------------     	   
    	case GameGlobals.UNIQUE_ID_BUTTON_GAME_OVER_UP: 
    		GameOptions.EditCurrentPlayerName( 0, -1 );
        	cap = (Caption)FindFirstControlById(gg.UNIQUE_ID_CAPTION_GAME_OVER_NAME);
            cap.SetText( GameOptions.CurrentPlayerName );     		
    	   break;
         //---------------------------------------------------------------------    	   
    	case GameGlobals.UNIQUE_ID_BUTTON_GAME_OVER_RIGHT:     		
    		GameOptions.EditCurrentPlayerName( 1, 0 );
        	cap = (Caption)FindFirstControlById(gg.UNIQUE_ID_CAPTION_GAME_OVER_NAME);
            cap.SetText( GameOptions.CurrentPlayerName );   
            cap.CursorCharPosition = GameOptions.CurrentPlayerNameCursorPosition;
    	   break;
         //---------------------------------------------------------------------
    	case GameGlobals.UNIQUE_ID_BUTTON_ABOUT_EULA_UP:
            if( EulaCaptionBox != null )
                EulaCaptionBox.MoveIndex(-5);    		
    		break;
         //---------------------------------------------------------------------    		
    	case GameGlobals.UNIQUE_ID_BUTTON_ABOUT_EULA_DOWN:
            if( EulaCaptionBox != null )
                EulaCaptionBox.MoveIndex(5);      		
    		break;
         //---------------------------------------------------------------------  
    	case GameGlobals.UNIQUE_ID_BUTTON_MENUI_O:
    		    CreateMenuA();
    	    break;
         //---------------------------------------------------------------------  
    	case GameGlobals.UNIQUE_ID_BUTTON_MENUI_X:    		
    		if( HighScores.CurrentObj.CheckNewHighScore( GameOptions.CurrentGameType, GameOptions.CurrentPlayerScore ) >= 1 )      	  
    			CreateMenuD();   
    		else
    			CreateMenuA();
    		
    		GameOptions.CurrentPlayerNameCursorPosition = 0;
    		SwapCellGrid.ClearFile();
    	    break;    	    
         //---------------------------------------------------------------------
         //---------------------------------------------------------------------      		
        default:
           break;
    	}
    	
       }
        // *** clear mouse and key input flags for control ***       
        go.ClearDupInput();    
/*        
        if( go.ClassType[GameObject.TYPE_BLOCK_GAME_ENGINE] > 0 )
        {
          BlockGameEngine bge = (BlockGameEngine)go;
          
          if( bge.GameOverFlag > 0 )
          {
            ControlList[i] = null;
			GameGlobals.ClearSaveGameData();
            CreateMenuD();
          }
        }
*/       
        
     }
  }  
//-------------------------------------------------------------------------------------
  protected void Destroy( int UniqueId, int GroupId )
  {
    if( UniqueId > 0 )
    {
      // *** remove all objects with matching UniqueId ***
     for( i = 0; i < CONTROL_LIST_LENGTH; i++ )
       if( ControlList[i] != null )  
         if( ControlList[i].UniqueId == UniqueId )
             ControlList[i] = null;
    }
    else
    if( GroupId > 0 )
    {
      // *** remove all objects with matching GroupId ***
     for( i = 0; i < CONTROL_LIST_LENGTH; i++ )
       if( ControlList[i] != null )  
         if( ControlList[i].GroupId == GroupId )
             ControlList[i] = null;      
    }
    else
    if( GroupId == 0 && UniqueId == 0 )
    {
      // *** remove all objects ***
     for( i = 0; i < CONTROL_LIST_LENGTH; i++ )
          ControlList[i] = null;      
    }
    
    EulaCaptionBox = null;
  }
//-------------------------------------------------------------------------------------
  public void Draw()
  {
    if( ItsMenuCursorParallelia != null )
        ItsMenuCursorParallelia.Draw();
    
    for( i = 0; i < CONTROL_LIST_LENGTH; i++ )
      if( ControlList[i] != null )  
          ControlList[i].Draw();
/*
    String str;
    str = new String(GameGlobals.dummystr + "\n\n " + GameControl.ScreenWidth + ", " 
  	+ GameControl.ScreenHeight );
*/  	
   
    //gg.debugcaption.SetText(gg.dummystr);	       
    //GameGlobals.debugcaption.Draw();
   
    if( GameGlobals.BackDrop != null )
        GameGlobals.BackDrop.Draw();    
  }  
//-------------------------------------------------------------------------------------
  // *** call it during screen onDraw ***
  public void Do()
  {
	if( ItsMenuCursorParallelia != null )
		ItsMenuCursorParallelia.Do();
	
    CheckControlListState();
    
    for( i = 0; i < CONTROL_LIST_LENGTH; i++ )
      if( ControlList[i] != null )
      {	  
          ControlList[i].Do();
       	
          if( ControlList[i].ClassType[GameObject.TYPE_SWAP_CELL_GRID_CONTROLLER] >= 1 )   
          {
        	SwapCellGridController scgc = (SwapCellGridController)ControlList[i];
        	
        	if( scgc.GameState == SwapCellGridController.GAME_STATE_END )
        	{
        		ControlList[i] = null; 
        		CreateMenuA();
        	}
        	else
            if( scgc.GameState == SwapCellGridController.GAME_STATE_GOTO_HIGHSCORE )
            {
            	ControlList[i] = null;
            	GameOptions.CurrentPlayerNameCursorPosition = 0;
            	CreateMenuD();
            }
          } 	
      }
   if( DoneLoadingFlag == 0  ) 
    if( GameControl.CheckDoneLoading() > 0 )
    { 	
    	Init();
        DoneLoadingFlag = 1;
    }       	   
/*    
    if( StartDelayCounter > 0 && StartDelayCounter > -1)
    {
    	StartDelayCounter--;
    	if( StartDelayCounter == 0 )
    	{
    		Init();
    		StartDelayCounter = -1;
    	}
    }
*/    
  }
//-------------------------------------------------------------------------------------
public int DoBackKey()
{
	int exitflag = 0;
	
    for( i = 0; i < CONTROL_LIST_LENGTH; i++ )
      if( ControlList[i] != null )  
      {
    	 if( ControlList[i].GroupId == GameGlobals.GROUP_ID_NONE )
    		 continue;
    	 
    	 switch( ControlList[i].GroupId )
    	 {
    	   case GameGlobals.GROUP_ID_MENU_A:
    		 exitflag = 1;
    		 break;
    	   case GameGlobals.GROUP_ID_MENU_B:
    	   case GameGlobals.GROUP_ID_MENU_C:    		   
    	   case GameGlobals.GROUP_ID_MENU_C2:
    	   case GameGlobals.GROUP_ID_MENU_D:
    	   case GameGlobals.GROUP_ID_MENU_E:
    	   case GameGlobals.GROUP_ID_MENU_G:
    	   case GameGlobals.GROUP_ID_MENU_I:
             CreateMenuA();	             
             break;
    	   case GameGlobals.GROUP_ID_MENU_F:
    		   if( ControlList[i].ClassType[GameObject.TYPE_SWAP_CELL_GRID_CONTROLLER] >= 1 )    	
    		   {
    			  SwapCellGridController scgc; 
    		      scgc = (SwapCellGridController)ControlList[i];    	
    		      scgc.DoFile(scgc.SAVE_FILE);
    		      scgc.GameState = scgc.GAME_STATE_END;    		      
    		      GameOptions.Save();
    		      
    		      if( GameOptions.CurrentGameType == GameOptions.GAME_INFINITE )
    		      {	  
    		    	 GameOptions.CurrentPlayerScore = scgc.ItsScoreBar.CurrentScore + scgc.ItsScoreBar.WorkingScore; 
    		         CreateMenuI();    
    		      }
  
    		   }    		   
    		 break;
           default:
        	exitflag = 1;
        	break;
    	 }
    	 break;
      }
  
    return exitflag;
}
//------------------------------------------------------------------------------------- 
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%