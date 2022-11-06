package dip;

// DIP = Dependency Inversion Principle (Bağımlılık Ters Çevirme Prensibi )
// Top-level modules should not depend on lower-level modules.
//(Üst seviyeli modüller, alt seviyeli modüllere bağlı olmamalı.)

class Publisher
{
    private $socialMedia;

    public function __construct(SocialMediaInterface $socialMedia) {
        $this->socialMedia = $socialMedia;
    }

    public function publish() {
        return $this->socialMedia->getComment();
    }
}

interface SocialMediaInterface {
    public function setComment(string $comment);
    public function getComment(): string;
}

class Twitter implements SocialMediaInterface {
    private $comment;

    public function setComment(string $comment) {
        $this->comment = $comment;
    }

    public function getComment(): string {
        return $this->comment;
    }
}

class Facebook implements SocialMediaInterface {
    private $comment;

    public function setComment(string $comment) {
        $this->comment = $comment;
    }

    public function getComment(): string {
        return $this->comment;
    }
}



public class Main {
    public static void main(String[] args) {

        $twitter = new Twitter();
        $twitter->setComment('Twitter comment');

        $publisher = new Publisher($twitter);
        echo $publisher->publish();

        $facebook = new Facebook();
        $facebook->setComment('Facebook comment');

        $publisher = new Publisher($facebook);
        echo $publisher->publish();
    }
}
