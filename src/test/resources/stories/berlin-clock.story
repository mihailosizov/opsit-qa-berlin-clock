Story: The Berlin Clock

Narrative:
    As a clock enthusiast
    I want to tell the time using the Berlin Clock
    So that I can increase the number of ways that I can read the time

Scenario: 1
Given time is 00:00:00
When I convert time with berlin-clock converter
Then clock should look like:
Y
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: 2
Given time is 13:17:01
When I convert time with berlin-clock converter
Then clock should look like:
O
RROO
RRRO
YYROOOOOOOO
YYOO

Scenario: 3
Given time is 23:59:59
When I convert time with berlin-clock converter
Then clock should look like:
O
RRRR
RRRO
YYRYYRYYRYY
YYYY

Scenario: 4
Given time is 24:00:00
When I convert time with berlin-clock converter
Then clock should look like:
Y
RRRR
RRRR
OOOOOOOOOOO
OOOO