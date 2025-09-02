<?php

class HighSchoolSweetheart
{
    public function firstLetter(string $name): string
    {
        $trimmedName = str_replace(" ", "", $name);
        return substr($trimmedName, 0, 1);
        throw new \BadFunctionCallException("Implement the function");
    }

    public function initial(string $name): string
    {
        return strtoupper($this->firstLetter($name)) . ".";
        throw new \BadFunctionCallException("Implement the function");
    }

    public function initials(string $name): string
    {
        $splittedName = explode(" ", $name);
        list($firstName, $lastName) = $splittedName;
        return $this->initial($firstName) . " " . $this->initial($lastName);
        throw new \BadFunctionCallException("Implement the function");
    }

    public function pair(string $sweetheart_a, string $sweetheart_b): string
    {
        $combinedName = $this->initials($sweetheart_a) . "  +  " . $this-> initials($sweetheart_b);
        return <<<END
                 ******       ******
               **      **   **      **
             **         ** **         **
            **            *            **
            **                         **
            **     {$combinedName}     **
             **                       **
               **                   **
                 **               **
                   **           **
                     **       **
                       **   **
                         ***
                          *
            END;
        throw new \BadFunctionCallException("Implement the function");
    }
}
