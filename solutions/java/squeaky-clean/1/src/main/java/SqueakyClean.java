class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++)
            {
                char c = identifier.charAt(i);

                if (c == ' ')
                {
                    sb.append("_");
                } else if (c == '-')
                {
                    c = Character.toUpperCase(identifier.charAt(i+1));
                    sb.append(c);
                    i++;
                } else if (Character.isDigit(c))
                {
                    switch (c)
                        {
                            case ('4'):
                                c = 'a';
                                sb.append(c);
                                break;
                            case ('3'):
                                c = 'e';
                                sb.append(c);
                                break;
                            case ('0'):
                                c = 'o';
                                sb.append(c);
                                break;
                            case ('1'):
                                c = 'l';
                                sb.append(c);
                                break;
                            case ('7'):
                                c = 't';
                                sb.append(c);
                                break;
                        }
                } else if (!Character.isLetter(c))
                {
                    // Skip append here
                } else
                {
                    sb.append(c);
                }
            }
        return sb.toString();
    }
}
