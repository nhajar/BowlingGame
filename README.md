# BowlingGame
Create a program, which, given a valid sequence of rolls for one line of American Ten-Pin Bowling,
produces the total score for the game.
The game or “line” of bowling consists of 10 turns or “frames”. In each frame the player has two
opportunities (roll) to knock down 10 pins. The score for the frame is the total number of pins knocked
down, plus bonuses for strikes and spares.
A spare is when the player knocks down all 10 pins in two tries. The bonus for that frame is the number
of pins knocked down by the next roll.
A strike is when the player knocks down all 10 pins on his first try. The bonus for that frame is the value
of the next two rolls.
A player who rolls a spare or strike in the last (tenth) frame gets to throw one or two more bonus balls,
respectively. These bonus throws are taken as part of the same turn. If the bonus throws knock down all
the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final
frame.
For more info about the rules: http://www.topendsports.com/sport/tenpin/scoring.htm

Examples:
(When scoring "X" indicates a strike, "/" indicates a spare, "-" indicates a miss)
 "XXXXXXXXXXXX" (12 rolls: 12 strikes) = 10+10+10 + 10+10+10 + 10+10+10 + 10+10+10 + 10+10+10 + 10+10+10 + 10+10+10 +
10+10+10 + 10+10+10 + 10+10+10 = 300
 "9-9-9-9-9-9-9-9-9-9-" (20 rolls: 10 pairs of 9 and miss) = 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 = 90
 "5/5/5/5/5/5/5/5/5/5/5" (21 rolls: 10 pairs of 5 and spare, with a final 5) = 10+5 + 10+5 + 10+5 + 10+5 + 10+5 + 10+5 + 10+5 +
10+5 + 10+5 + 10+5 = 150
