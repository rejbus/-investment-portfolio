<?
	$adresat = 'rejbus@wp.pl';
	@$email = $_POST['email'];
	@$content = $_POST['content'];
	$header = 	"From: ktos@serwer.pl \nContent-Type:".
			' text/plain;charset="iso-8859-2"'.
			"\nContent-Transfer-Encoding: 8bit";
	if (mail($adresat, 'List ze strony', $content, $header))
		header('location: http://serwer_bez_php.pl/kontakt_ok.htm');
	else
			header('location: http://serwer_bez_php.pl/kontakt_blad.htm');
?>